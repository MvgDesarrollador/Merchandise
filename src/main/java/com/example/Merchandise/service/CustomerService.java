package com.example.Merchandise.service;

import com.example.Merchandise.dto.ClientDTO;

public interface CustomerService {

    ClientDTO createClient(ClientDTO clientDTO);

    ClientDTO getClient(String document);

    ClientDTO updateClient(String document, ClientDTO clientDTO);

    void deleteClient(String document);

}
