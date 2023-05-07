package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.repository.IAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    IAddressRepository addressRepo;

    @GetMapping(value = "/getAllAddress")
    List<Address> getAllAddress(){
        return addressRepo.findAll();
    }
    @GetMapping("getAddressById/{id}")
    Address findById(@PathVariable Long id){
        return addressRepo.findById(id).get();
    }

    @PostMapping(value = "/address")
    void saveAddress(@RequestBody Address address)
    {
        addressRepo.save(address);
    }
    @PutMapping("address/{id}")
    Address updateById(@PathVariable Long id,@RequestBody Address address){

        Address address1 = addressRepo.findById(id).get();
        address1.setCityName(address.getCityName());
        address1.setStreetName(address.getStreetName());
        address1.setZipCode(address.getZipCode());
        address1.setState(address.getState());

        return address1;

    }
    @DeleteMapping("address/{id}")
    Address deleteById(@PathVariable Long id){
        Address address1 = addressRepo.findById(id).get();
        if(address1 != null){
            addressRepo.deleteById(id);
            return address1;
        }
        return null;
    }
}
