package com.example.aulaorm;

import com.example.aulaorm.entities.Department;
import com.example.aulaorm.entities.Employee;
import com.example.aulaorm.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AulaormApplication implements CommandLineRunner {


    @Autowired
    private EmployeeRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AulaormApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> result = repository.findAll();
        for (Employee emp:result) {
            System.out.println(emp);
            
        }


    }
}
