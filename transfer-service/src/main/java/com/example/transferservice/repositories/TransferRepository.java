package com.example.transferservice.repositories;

import com.example.transferservice.entities.Transfert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransferRepository extends JpaRepository<Transfert,Long> {
}
