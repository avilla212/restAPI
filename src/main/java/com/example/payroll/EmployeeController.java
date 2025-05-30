package com.example.payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;


    // Constructor based injection of the repo
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // ========================================
    // GET a single employee by ID
    // Example: GET /api/employees/1
    // ========================================
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    // ====================================
    // POST a new employee (create)
    // Example: POST /api/employees
    // Request Body: JSON with name and role
    // ====================================

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        // saves the new employee to the database
        return employeeRepository.save(employee);
    }

    // ==========================================
    // PUT (update) an existing employee by ID
    // Example: PUT /api/employees/1
    // Request Body: JSON with new name and role
    // ==========================================
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    // ========================================
    // DELETE an employee by ID
    // Example: DELETE /api/employees/1
    // ========================================
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable long id){
        employeeRepository.deleteById(id);
    }

}
