package com.example.Merchandise.service;

import com.example.Merchandise.dto.WarehouseDTO;

public interface WarehouseService {

    WarehouseDTO createWarehouse(WarehouseDTO wareHouseDTO);

    WarehouseDTO getWarehouse(int id);

    WarehouseDTO updateWarehouse(int id, WarehouseDTO wareHouseDTO);

    void deleteWarehouse(int id);

}
