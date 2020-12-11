package com.rodrigues.marcos.restapicidades.countries.resources;

import com.rodrigues.marcos.restapicidades.countries.entities.Country;
import com.rodrigues.marcos.restapicidades.countries.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryResource {

    @Autowired
    private CountryRepository repository;

    @GetMapping("/countries")
    public ResponseEntity<Page<Country>> countries(Pageable page){
        return ResponseEntity.ok().body(repository.findAll(page));
    }

    @GetMapping("/countries/{id}")
    public ResponseEntity<Country> countriesByID(@PathVariable("id") Long id){

        Optional<Country> byId = repository.findById(id);
        if(byId.isPresent()){
            return ResponseEntity.ok().body(byId.get());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
