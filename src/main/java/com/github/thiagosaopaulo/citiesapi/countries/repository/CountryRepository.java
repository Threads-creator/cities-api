package com.github.thiagosaopaulo.citiesapi.countries.repository;

import com.github.thiagosaopaulo.citiesapi.countries.entitys.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
