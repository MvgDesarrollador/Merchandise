package com.example.Merchandise.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.Merchandise.dto.ClientDTO;
import com.example.Merchandise.service.CustomerService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api-client")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/client")
    ResponseEntity<ClientDTO> createClient(@RequestBody ClientDTO clientDTO){
        ClientDTO clientCreated = customerService.createClient(clientDTO);
        return new ResponseEntity<>(clientCreated, HttpStatus.CREATED);
    }

    @PutMapping("/client/{document}")
    ResponseEntity<ClientDTO> updateClient(@PathVariable String document, @RequestBody ClientDTO clientDTO){
        ClientDTO clientUpdated = customerService.updateClient(document, clientDTO);
        return new ResponseEntity<>(clientUpdated, HttpStatus.OK);
    }

    @GetMapping("/client/{document}")
    ResponseEntity<ClientDTO> getClient(@PathVariable String document){
        ClientDTO clientGet = customerService.getClient(document);
        return new ResponseEntity<>(clientGet, HttpStatus.OK);
    }

    @DeleteMapping("/client/{document}")
    ResponseEntity<Void> deleteClient(@PathVariable String document){
        customerService.deleteClient(document);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
