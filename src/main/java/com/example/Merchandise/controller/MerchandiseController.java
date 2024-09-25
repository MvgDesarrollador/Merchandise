package com.example.Merchandise.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Merchandise.dto.MerchandiseDTO;
import com.example.Merchandise.service.MerchandiseService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-merchandise")
public class MerchandiseController {

    private final MerchandiseService merchandiseService;

    @PostMapping("/merchandise")
    public ResponseEntity<MerchandiseDTO> createMerchandise(@RequestBody MerchandiseDTO merchandiseDTO){
        MerchandiseDTO merchandiseCreated = merchandiseService.createMerchandise(merchandiseDTO);
        return new ResponseEntity<>(merchandiseCreated, HttpStatus.CREATED);
    }

    @GetMapping("/merchandise/{id}")
    public ResponseEntity<MerchandiseDTO> getMerchandise(@PathVariable int id){
        MerchandiseDTO merchandiseGet = merchandiseService.getMerchandise(id);
        return new ResponseEntity<>(merchandiseGet, HttpStatus.OK);
    }

    @PutMapping("/merchandise/{id}")
    public ResponseEntity<MerchandiseDTO> updateMerchandise(@PathVariable int id, @RequestBody MerchandiseDTO merchandiseDTO){
        MerchandiseDTO merchandiseUpdated = merchandiseService.updateMerchandise(id, merchandiseDTO);
        return new ResponseEntity<>(merchandiseUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/merchandise/{id}")
    public ResponseEntity<Void> deleteMerchandise(@PathVariable int id){
        merchandiseService.deleteMerchandise(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
