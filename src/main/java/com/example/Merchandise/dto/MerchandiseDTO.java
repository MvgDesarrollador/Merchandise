package com.example.Merchandise.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MerchandiseDTO {

    private Double volumeOccupies;
    private Double weightOccupies;
    private String name;
    private String description;
    private LocalDate dateEntry;
    private LocalDate dateExit;

}
