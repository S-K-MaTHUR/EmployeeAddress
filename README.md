<center>
<h1> Employee_Address</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is based on Employement Address that is built with the help of Spring Boot with Java and H2 database.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The employee data model is defined in the Employee class, which has the following attributes:
```
employeeId : unique identifier for each employee
employee_first_Name : first name of the employee
employee_Last_Name : last name of the employee
Address : address of the employee
```
The address data model is defined in the Address class, which has the following attributes:
---
addressId : unique address Id of the employee
address_street: street name of the employee
city : city name of the employee
state : state name of the employee
Zipcode : zipcode of the employee

---

## Data Flow

1. The employee sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the proper controller method.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Get all employees </b>

* PostMapping: /employee
```
* GetMapping: /getAllEmployees
```
* GetMapping: "findAddressById/{id}"
```
* PutMapping: "updateAddressById/{id}"
```

* DeleteMapping: "employee/{id}"
````

## Data structure Used
* ArrayList
```
We have used ArrayList data structure as a database to implement CRUD Operations 
```
---

## Project Summary

The Employee_Address is a Spring Boot project using Java as a language to enables basic functionality for managing employees.The project is built with the help of Spring Boot Framework for building production-ready applications and this project also use ArrayList as the data structure to store and manage employee data. 

The following project consist of two class i.e; (AddressController and EmployeeController), (Address & Employee) and a Interface of (IAddressRepository and IEmployeeRepository).
