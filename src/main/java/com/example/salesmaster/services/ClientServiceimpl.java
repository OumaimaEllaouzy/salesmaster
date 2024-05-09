package com.example.salesmaster.services;

import com.example.salesmaster.entities.Client;
import com.example.salesmaster.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceimpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Long id,Client client) {
       Client clientFound = getClientById(id);
       return clientRepository.save(clientFound);
    }

    @Override
    public void deleteClientById(Long id) {
       Client client=getClientById(id);
       clientRepository.delete(client);
          }

    @Override
    public void deleteAllClients() {
       clientRepository.deleteAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("client Does not exist !"));

    }
    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

}
