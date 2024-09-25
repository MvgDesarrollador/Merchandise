package com.example.Merchandise.service;

import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.Merchandise.mapper.MerchandiseMapper;
import com.example.Merchandise.entity.MerchandiseEntity;
import com.example.Merchandise.dto.MerchandiseDTO;
import com.example.Merchandise.repository.MerchandiseRepository;

@RequiredArgsConstructor
@Service
public class MerchandiseServiceImpl implements MerchandiseService{

    private final MerchandiseRepository merchandiseRepository;

    private final MerchandiseMapper merchandiseMapper;

    @Override
    public MerchandiseDTO createMerchandise(MerchandiseDTO merchandiseDTO) {
        MerchandiseEntity merchandiseToCreate = merchandiseMapper.merchandiseConvertToEntity(merchandiseDTO);
        merchandiseRepository.save(merchandiseToCreate);
        return merchandiseMapper.merchandiseConvertToDto(merchandiseToCreate);
    }

    @Override
    public MerchandiseDTO getMerchandise(int id) {
        MerchandiseEntity merchandiseToGet = merchandiseRepository.findById(id);
        return merchandiseMapper.merchandiseConvertToDto(merchandiseToGet);
    }

    @Override
    public MerchandiseDTO updateMerchandise(int id, MerchandiseDTO merchandiseDTO) {
        MerchandiseEntity merchandiseToUpdate = merchandiseRepository.findById(id);

        merchandiseToUpdate.setVolumeOccupies(merchandiseDTO.getVolumeOccupies());
        merchandiseToUpdate.setWeightOccupies(merchandiseDTO.getWeightOccupies());
        merchandiseToUpdate.setName(merchandiseDTO.getName());
        merchandiseToUpdate.setDescription(merchandiseDTO.getDescription());
        merchandiseToUpdate.setDateEntry(merchandiseDTO.getDateEntry());
        merchandiseToUpdate.setDateExit(merchandiseDTO.getDateExit());

        merchandiseRepository.save(merchandiseToUpdate);

        return merchandiseMapper.merchandiseConvertToDto(merchandiseToUpdate);
    }

    @Transactional
    @Override
    public void deleteMerchandise(int id) {
        merchandiseRepository.deleteById(id);
    }

}
