package com.example.Merchandise.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClientDTO {

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
