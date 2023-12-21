package com.example.transferservice.entities;

import com.example.transferservice.enums.Etat;
import com.example.transferservice.models.Wallet.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Transfert {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date date;
    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestination;
    private float montant;
    private Etat etat;
}
