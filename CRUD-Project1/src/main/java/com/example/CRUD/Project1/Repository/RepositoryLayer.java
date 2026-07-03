package com.example.CRUD.Project1.Repository;

import com.example.CRUD.Project1.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLayer  extends JpaRepository<Employee,Integer> {
//extends JpaRepository<ModelLayer,Integer
}
