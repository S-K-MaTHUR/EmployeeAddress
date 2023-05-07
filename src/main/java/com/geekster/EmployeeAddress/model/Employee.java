package com.geekster.EmployeeAddress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Address employeeAddress;
}
