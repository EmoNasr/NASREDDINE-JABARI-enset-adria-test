package com.example.walletservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private float solde;
    private Date date_creation;
    private float devise;
    @ManyToOne
    private Client client;
}
