package com.github.lucasomeira.citiesapi.countries.repository;

import com.github.lucasomeira.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
