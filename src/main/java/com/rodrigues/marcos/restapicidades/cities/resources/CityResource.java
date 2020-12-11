package com.rodrigues.marcos.restapicidades.cities.resources;

import com.rodrigues.marcos.restapicidades.cities.entities.City;
import com.rodrigues.marcos.restapicidades.cities.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

    @GetMapping
    public Page<City> getAllCity(Pageable page){
        return repository.findAll(page);
    }
}
