package com.example.patient.patient.Model;


import jakarta.persistence.*;
import lombok.*;
@Data
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private  String name;
    private  int age;
    private  String gender;
    private  String address;
    private  int phone_number;




}
