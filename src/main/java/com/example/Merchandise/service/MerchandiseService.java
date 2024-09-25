package com.example.Merchandise.service;

import com.example.Merchandise.dto.MerchandiseDTO;

public interface MerchandiseService {

    MerchandiseDTO createMerchandise(MerchandiseDTO merchandiseDTO);

    MerchandiseDTO getMerchandise(int id);

    MerchandiseDTO updateMerchandise(int id, MerchandiseDTO merchandiseDTO);

    void deleteMerchandise(int id);

}
