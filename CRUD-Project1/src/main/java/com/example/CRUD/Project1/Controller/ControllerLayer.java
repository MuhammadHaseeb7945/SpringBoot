package com.example.CRUD.Project1.Controller;

import com.example.CRUD.Project1.Model.Employee;
import com.example.CRUD.Project1.Service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerLayer {
    @Autowired
    ServiceLayer service;
    @GetMapping("/")
    public String greet(){
        return "hello";
    }
    @GetMapping("/employees/id")
    public Employee getEmployeeByParameter(@RequestParam int id){
        return service.getEmployeeByParameter(id);
    }
    @GetMapping("/employees")
    public List<Employee> getEmployee(){
      return service.getEmployee();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return service.getEmployeeById(id);
    }
   @PostMapping("/employees")
    public List<Employee> addEmployee(@RequestBody Employee employee){
        return service.addEmployee(employee);
   }
   @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
    return service.updateEmployee(employee);
   }
  @DeleteMapping("/employees")
    public String deleteEmployee(@RequestBody Employee employee){
       return service.deleteEmployee(employee);


  }
  @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return service.deleteById(id);

  }

}
