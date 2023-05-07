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
public class Address {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addressId;
    private String streetName;
    private String cityName;
    private String state;
    private String zipCode;

    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;


}
