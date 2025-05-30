package com.example.payroll;

import org.springframework.data.jpa.repository.JpaRepository;

// Employee is the model
// Long id is th primary key

// we now get methods like save, findAll, findById and deleteById for free
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
