package com.joborder.apijoborder.clients.rest;

import com.joborder.apijoborder.clients.model.entity.Client;
import com.joborder.apijoborder.clients.model.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientRepository repository;

    @Autowired
    public ClientController(ClientRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client post(@RequestBody Client client) {

        return repository.save(client);
    }

    @GetMapping("{id}")
    public Client filterById(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        repository
                .findById(id)
                .map(client -> {
                    repository.delete(client);
                    return Void.TYPE;
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateById(@PathVariable Integer id, @RequestBody Client clientUpdated) {
        repository
                .findById(id)
                .map(client -> {
                    clientUpdated.setId(client.getId());
                    return repository.save(clientUpdated);
                })
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
