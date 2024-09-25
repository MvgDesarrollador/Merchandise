package com.example.Merchandise.mapper;

import org.springframework.stereotype.Component;

import com.example.Merchandise.entity.MerchandiseEntity;
import com.example.Merchandise.dto.MerchandiseDTO;

@Component
public class MerchandiseMapper {

    public MerchandiseDTO merchandiseConvertToDto(MerchandiseEntity merchandiseEntity){
        return new MerchandiseDTO(merchandiseEntity.getVolumeOccupies(), merchandiseEntity.getWeightOccupies(), merchandiseEntity.getName(),
                merchandiseEntity.getDescription(), merchandiseEntity.getDateEntry(), merchandiseEntity.getDateExit());
    }

    public MerchandiseEntity merchandiseConvertToEntity(MerchandiseDTO merchandiseDTO){
        MerchandiseEntity merchandiseEntity = new MerchandiseEntity();

        merchandiseEntity.setVolumeOccupies(merchandiseDTO.getVolumeOccupies());
        merchandiseEntity.setWeightOccupies(merchandiseDTO.getWeightOccupies());
        merchandiseEntity.setName(merchandiseDTO.getName());
        merchandiseEntity.setDescription(merchandiseDTO.getDescription());
        merchandiseEntity.setDateEntry(merchandiseDTO.getDateEntry());
        merchandiseEntity.setDateExit(merchandiseDTO.getDateExit());

        return merchandiseEntity;
    }

}
