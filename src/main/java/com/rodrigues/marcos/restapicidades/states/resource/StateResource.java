package com.rodrigues.marcos.restapicidades.states.resource;

import com.rodrigues.marcos.restapicidades.states.entities.State;
import com.rodrigues.marcos.restapicidades.states.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

    @GetMapping
    public List<State> getStaties(){
        return repository.findAll();
    }
}
