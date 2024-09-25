package com.example.Merchandise.service;

import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.Merchandise.mapper.WarehouseMapper;
import com.example.Merchandise.entity.WarehouseEntity;
import com.example.Merchandise.dto.WarehouseDTO;
import com.example.Merchandise.repository.WarehouseRepository;

@RequiredArgsConstructor
@Service
public class WarehouseServiceImpl implements WarehouseService{

    private final WarehouseRepository warehouseRepository;

    private final WarehouseMapper wareHouseMapper;

    @Override
    public WarehouseDTO createWarehouse(WarehouseDTO wareHouseDTO) {
        WarehouseEntity warehouseToCreate = wareHouseMapper.wareHouseConvertToEntity(wareHouseDTO);
        warehouseRepository.save(warehouseToCreate);
        return wareHouseMapper.wareHouseConvertToDto(warehouseToCreate);
    }

    @Override
    public WarehouseDTO getWarehouse(int id) {
        WarehouseEntity warehouseToGet = warehouseRepository.findById(id);
        return wareHouseMapper.wareHouseConvertToDto(warehouseToGet);
    }

    @Override
    public WarehouseDTO updateWarehouse(int id, WarehouseDTO wareHouseDTO) {
        WarehouseEntity warehouseToUpdate = warehouseRepository.findById(id);

        warehouseToUpdate.setName(wareHouseDTO.getName());
        warehouseToUpdate.setDepartment(wareHouseDTO.getDepartment());
        warehouseToUpdate.setMunicipality(wareHouseDTO.getMunicipality());
        warehouseToUpdate.setAddress(wareHouseDTO.getAddress());
        warehouseToUpdate.setInstalledVolumeCapacity(wareHouseDTO.getInstalledVolumeCapacity());

        warehouseRepository.save(warehouseToUpdate);

        return wareHouseMapper.wareHouseConvertToDto(warehouseToUpdate);
    }

    @Transactional
    @Override
    public void deleteWarehouse(int id) {
        warehouseRepository.deleteById(id);
    }

}
