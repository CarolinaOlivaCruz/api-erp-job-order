package com.joborder.apijoborder;

import com.joborder.apijoborder.clients.model.entity.Client;
import com.joborder.apijoborder.clients.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiJobOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiJobOrderApplication.class, args);
    }

}
