package com.example.Merchandise.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Merchandise.dto.ZoneWarehouseDTO;
import com.example.Merchandise.service.WarehouseZoneService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-zone-warehouse")
public class WarehouseZoneController {

    private final WarehouseZoneService warehouseZoneService;

    @PostMapping("/zone-warehouse")
    public ResponseEntity<ZoneWarehouseDTO> createZoneWarehouse(@RequestBody ZoneWarehouseDTO zoneWarehouseDTO){
        ZoneWarehouseDTO zoneWarehouseCreated = warehouseZoneService.createZoneWarehouse(zoneWarehouseDTO);
        return new ResponseEntity<>(zoneWarehouseCreated, HttpStatus.CREATED);
    }

    @GetMapping("/zone-warehouse/{id}")
    public ResponseEntity<ZoneWarehouseDTO> getZoneWarehouse(@PathVariable int id){
        ZoneWarehouseDTO zoneWarehouseGet = warehouseZoneService.getZoneWareHouse(id);
        return new ResponseEntity<>(zoneWarehouseGet, HttpStatus.OK);
    }

    @PutMapping("/zone-warehouse/{id}")
    public ResponseEntity<ZoneWarehouseDTO> updateZoneWarehouse(@PathVariable int id, @RequestBody ZoneWarehouseDTO zoneWarehouseDTO){
        ZoneWarehouseDTO zoneWarehouseUpdated = warehouseZoneService.updateZoneWarehouse(id, zoneWarehouseDTO);
        return new ResponseEntity<>(zoneWarehouseUpdated, HttpStatus.OK);
    }

    @DeleteMapping("/zone-warehouse/{id}")
    public ResponseEntity<Void> deleteZoneWarehouse(@PathVariable int id){
        warehouseZoneService.deleteZoneWareHouse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
