package com.example.Merchandise.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZoneWarehouseDTO {

    private String name;
    private Double maxVolume;
    private Double maxWeight;
    private Double occupiedVolume;
    private Double occupiedWeight;

}
