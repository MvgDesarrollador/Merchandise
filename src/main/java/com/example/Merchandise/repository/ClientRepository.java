package com.example.Merchandise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Merchandise.entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

    ClientEntity findByDocument(String document);

    void deleteByDocument(String document);

}
