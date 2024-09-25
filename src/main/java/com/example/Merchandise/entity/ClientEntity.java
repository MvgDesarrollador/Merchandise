package com.example.Merchandise.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String document;
    private String name;
    private String department;
    private String municipality;
    private String address;
    private String zipCode;
    private String rol;
    private String email;
    private String phone;

}
