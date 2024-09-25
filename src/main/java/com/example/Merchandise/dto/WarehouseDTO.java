package com.example.Merchandise.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WarehouseDTO {

    private String name;
    private String department;
    private String municipality;
    private String address;
    private long installedVolumeCapacity;

}
