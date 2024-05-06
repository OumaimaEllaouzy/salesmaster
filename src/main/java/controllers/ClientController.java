package controllers;

import com.example.salesmaster.entities.Client;
import com.example.salesmaster.services.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@AllArgsConstructor
public class ClientController {
    private ClientService ClientService;

    @GetMapping("/createClient")
    public String createClient(){
        return"createClient";
    }

}
