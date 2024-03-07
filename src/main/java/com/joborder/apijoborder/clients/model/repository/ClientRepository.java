package com.joborder.apijoborder.clients.model.repository;

import com.joborder.apijoborder.clients.model.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
