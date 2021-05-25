package com.github.thiagosaopaulo.citiesapi.countries.resources;

import com.github.thiagosaopaulo.citiesapi.countries.entitys.Country;
import com.github.thiagosaopaulo.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository respository;


    @GetMapping
    public Page<Country> countries(Pageable page){
        return respository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> getOne(@PathVariable Long id){
        Optional<Country> optional = respository.findById(id);

        if(optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        return ResponseEntity.notFound().build();
    }
}
