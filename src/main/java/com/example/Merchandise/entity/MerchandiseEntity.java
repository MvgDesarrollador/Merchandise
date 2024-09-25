package com.example.Merchandise.entity;

import java.time.LocalDate;

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
public class MerchandiseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Double volumeOccupies;
    private Double weightOccupies;
    private String name;
    private String description;
    private LocalDate dateEntry;
    private LocalDate dateExit;

}
