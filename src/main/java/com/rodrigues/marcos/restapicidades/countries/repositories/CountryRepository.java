package com.rodrigues.marcos.restapicidades.countries.repositories;

import com.rodrigues.marcos.restapicidades.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
