package com.example.Merchandise.service;

import com.example.Merchandise.dto.ZoneWarehouseDTO;

public interface WarehouseZoneService {

    ZoneWarehouseDTO createZoneWarehouse(ZoneWarehouseDTO zoneWarehouseDTO);

    ZoneWarehouseDTO getZoneWareHouse(int id);

    ZoneWarehouseDTO updateZoneWarehouse(int id, ZoneWarehouseDTO zoneWarehouseDTO);

    void deleteZoneWareHouse(int id);

}
