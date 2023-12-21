package com.example.walletservice;

import com.example.walletservice.entities.Client;
import com.example.walletservice.entities.Wallet;
import com.example.walletservice.repositories.ClientRepository;
import com.example.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }

    // utilisation de commandlinerunner pour creer des objets comme test
    @Bean
    CommandLineRunner start(ClientRepository clientRepository, WalletRepository walletRepository){
        return args -> {
            Client client = new Client(null,"nasr","nasr@gmail.com",null);
            Wallet wallet = new Wallet(null,2000,new Date(),152,client);
            clientRepository.save(client);
            walletRepository.save(wallet);
            walletRepository.findAll().forEach(w->{
                System.out.println(w.getId());
                System.out.println(w.getDevise());
                System.out.println(w.getClient().getNom());
            });

        };
    }
}
