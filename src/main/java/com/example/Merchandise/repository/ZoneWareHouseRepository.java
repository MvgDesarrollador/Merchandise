package com.example.Merchandise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Merchandise.entity.ZoneWarehouseEntity;

@Repository
public interface ZoneWareHouseRepository extends JpaRepository<ZoneWarehouseEntity, Integer> {

    //Se sobre escribe metodo ya que el por defecto me retorna optional y no lo considero necesario.
    ZoneWarehouseEntity findById(int id);


}
