package com.example.salesmaster.Controllers;
import com.example.salesmaster.entities.Client;
import com.example.salesmaster.services.ClientServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/client")
@RestController
public class ClientController {
    @Autowired
    private ClientServiceimpl clientService;

    @GetMapping
    public ResponseEntity<List<Client>> getClients()
    {
        return ResponseEntity.ok(clientService.getAllClient());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") Long clientId)
    {
        return ResponseEntity.ok(clientService.getClientById(clientId));
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client)
    {
        Client client1 = clientService.saveClient(client);
        return new ResponseEntity<>(client1, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") Long clientId , @RequestBody Client client)
    {
        Client client1 = clientService.updateClient(clientId , client);
        return new ResponseEntity<>(client1, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable("id") Long clientId)
    {
        clientService.deleteClientById(clientId);
        return ResponseEntity.ok("Client deleted successfully !");
    }

}