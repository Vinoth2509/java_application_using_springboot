package com.example.demo.controllers;

import com.example.demo.entity.Employee;
import com.example.demo.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {

    final
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/get/all")
    public List<Employee> getAll(){
        return  employeeService.getAllEmployee();
    }

    @PostMapping(path = "/add")
    public Employee  add(@RequestBody Employee emp){
        return  employeeService.addEmp(emp);
    }

    @PutMapping(path ="/edit")
    public Employee  edit(@RequestBody Employee emp){
        return  employeeService.editEmp(emp);
    }

    @DeleteMapping(path="/delete")
    public String delete(@RequestParam int id){
        return employeeService.deleteEmp(id);
    }


}
