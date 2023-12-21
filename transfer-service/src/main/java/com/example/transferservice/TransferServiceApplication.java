package com.example.transferservice;

import com.example.transferservice.entities.Transfert;
import com.example.transferservice.enums.Etat;
import com.example.transferservice.repositories.TransferRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class TransferServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransferServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(TransferRepository transferRepository){
        return args -> {
            transferRepository.save(new Transfert(null,new Date(),null,null,25500, Etat.REJECTED));
            transferRepository.save(new Transfert(null,new Date(),null,null,287800, Etat.PENDIND));
            transferRepository.save(new Transfert(null,new Date(),null,null,2500, Etat.VALIDATED));

            transferRepository.findAll().forEach(w->{
                System.out.println(w.toString());
            });
        };
    }
}
