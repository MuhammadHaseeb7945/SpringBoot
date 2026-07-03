package com.example.CRUD.Project1.Service;

import com.example.CRUD.Project1.Model.Employee;
import com.example.CRUD.Project1.Repository.RepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLayer {

    @Autowired
    RepositoryLayer repo;
    public List<Employee> getEmployee() {
     return repo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public List<Employee> addEmployee(Employee employee) {
         repo.save(employee);
         return repo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return repo.save(employee);
    }

    public String deleteEmployee(Employee employee) {
        repo.delete(employee);
        return "Delete Successfully";
    }

    public String deleteById(int id) {
        repo.deleteById(id);
        return "Delete by id Successfully";
    }

    public Employee getEmployeeByParameter(int id) {
        return repo.findById(id).orElse(null);
    }
}
