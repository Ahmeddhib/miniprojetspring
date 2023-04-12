package com.ahmed.buss;

import com.ahmed.buss.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BussApplication implements CommandLineRunner {
    @Autowired
    private BusService busService;
    public static void main(String[] args) {
        SpringApplication.run(BussApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        //produitService.saveProduit(new Produit("iphone 13", 2600.0, new Date()));
       // produitService.saveProduit(new Produit("MSI Katana", 2800.0, new Date()));
        //produitService.saveProduit(new Produit("PS5", 3000.0, new Date()));
    }
}


