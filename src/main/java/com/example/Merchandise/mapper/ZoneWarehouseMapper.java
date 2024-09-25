package com.example.Merchandise.mapper;

import org.springframework.stereotype.Component;

import com.example.Merchandise.entity.ZoneWarehouseEntity;
import com.example.Merchandise.dto.ZoneWarehouseDTO;

@Component
public class ZoneWarehouseMapper {

    public ZoneWarehouseDTO zoneWarehouseConvertToDto(ZoneWarehouseEntity zoneWarehouseEntity){
        return new ZoneWarehouseDTO(zoneWarehouseEntity.getName(), zoneWarehouseEntity.getMaxVolume(), zoneWarehouseEntity.getMaxWeight(),
                zoneWarehouseEntity.getOccupiedVolume(), zoneWarehouseEntity.getOccupiedWeight());
    }

    public ZoneWarehouseEntity zoneWarehouseConvertToEntity(ZoneWarehouseDTO zoneWarehouseDTO){
        ZoneWarehouseEntity zoneWarehouseEntity = new ZoneWarehouseEntity();

        zoneWarehouseEntity.setName(zoneWarehouseDTO.getName());
        zoneWarehouseEntity.setMaxVolume(zoneWarehouseDTO.getMaxVolume());
        zoneWarehouseEntity.setMaxWeight(zoneWarehouseDTO.getMaxWeight());
        zoneWarehouseEntity.setOccupiedVolume(zoneWarehouseDTO.getOccupiedVolume());
        zoneWarehouseEntity.setOccupiedWeight(zoneWarehouseDTO.getOccupiedWeight());

        return zoneWarehouseEntity;
    }

}
