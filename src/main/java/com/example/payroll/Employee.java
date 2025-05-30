package com.example.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

@Entity
public class Employee {
    private @Id
    @GeneratedValue Long id;

    private String name;
    private String role;

    public Employee() {}

    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }

    // getters
    public Long getId() {return this.id; }
    public String getName() {return this.name; }
    public String getRole() { return this.role; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', role='" + role + "'}";
    }
}

