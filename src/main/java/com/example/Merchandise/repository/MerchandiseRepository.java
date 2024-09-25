package com.example.Merchandise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Merchandise.entity.MerchandiseEntity;

@Repository
public interface MerchandiseRepository extends JpaRepository<MerchandiseEntity, Integer> {

    //Se sobre escribe metodo ya que el por defecto me retorna optional y no lo considero necesario.
    MerchandiseEntity findById(int id);

}
