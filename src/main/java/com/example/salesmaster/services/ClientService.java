package com.example.salesmaster.services;

import com.example.salesmaster.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);
    Client updateClient(Client client);
    void deleteClientById(Long id);
    void deleteAllClients();
    Client getClientById(Long id);
    List<Client> getAllClients();
}
