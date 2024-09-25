package com.example.Merchandise.service;
import jakarta.transaction.Transactional;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.example.Merchandise.mapper.ClientMapper;
import com.example.Merchandise.entity.ClientEntity;
import com.example.Merchandise.dto.ClientDTO;
import com.example.Merchandise.repository.ClientRepository;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public ClientDTO createClient(ClientDTO clientDTO) {
        ClientEntity clientExistence = clientRepository.findByDocument(clientDTO.getDocument());
        ClientEntity clientToCreate = clientMapper.clientConvertToEntity(clientDTO);
        ClientEntity clientSaved = clientRepository.save(clientToCreate);
        return clientMapper.clientConvertToDto(clientSaved);
    }

    @Override
    public ClientDTO getClient(String document) {
        ClientEntity clientToGet = clientRepository.findByDocument(document);
        return clientMapper.clientConvertToDto(clientToGet);
    }

    @Override
    public ClientDTO updateClient(String document, ClientDTO clientDTO) {
        ClientEntity clientToEdit = clientRepository.findByDocument(document);
        clientToEdit.setName(clientDTO.getName());
        clientToEdit.setDepartment(clientDTO.getDepartment());
        clientToEdit.setMunicipality(clientDTO.getMunicipality());
        clientToEdit.setAddress(clientDTO.getAddress());
        clientToEdit.setZipCode(clientDTO.getZipCode());
        clientToEdit.setRol(clientDTO.getRol());
        clientToEdit.setEmail(clientDTO.getEmail());
        clientToEdit.setPhone(clientDTO.getPhone());
        clientRepository.save(clientToEdit);
        return clientMapper.clientConvertToDto(clientToEdit);
    }

    @Transactional
    @Override
    public void deleteClient(String document) {
        clientRepository.deleteByDocument(document);
    }
}
