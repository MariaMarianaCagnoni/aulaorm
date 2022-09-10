package com.example.aulaorm.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_department")
public class Department {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;

    public Department(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Department() {
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
