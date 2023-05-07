package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    IEmployeeRepository employeeRepository;

    @GetMapping("getAllEmployees")
    Iterable<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    @GetMapping("getAddressById/{id}")
    Employee getAddressById(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }


    @PostMapping(value = "/employee")
        void saveEmployee(@RequestBody Employee employee)
    {
        employeeRepository.save(employee);
    }

    @PutMapping("updateAddressById/{id}")
    Employee updateAddressById(@PathVariable Long id,@RequestBody Employee employee){
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setEmployeeFirstName(employee.getEmployeeFirstName());
        employee1.setEmployeeLastName(employee.getEmployeeLastName());
        employee1.setEmployeeAddress(employee.getEmployeeAddress());

        return employee1;

    }

    @DeleteMapping("employee/{id}")
    Employee deleteById(@PathVariable Long id){
        Employee employee1 = employeeRepository.findById(id).get();
        if(employee1 != null){
            employeeRepository.deleteById(id);
            return employee1;
        }
        return null;
    }
}
