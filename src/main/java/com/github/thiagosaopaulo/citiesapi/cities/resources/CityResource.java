package com.github.thiagosaopaulo.citiesapi.cities.resources;

import com.github.thiagosaopaulo.citiesapi.cities.entitys.City;
import com.github.thiagosaopaulo.citiesapi.cities.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
public class CityResource {

    @Autowired
    private CityRepository repository;

//    @GetMapping
//    public List<City> cities(){
//        return repository.findAll();
//    }

    @GetMapping
    public Page<City> getCities(final Pageable page){
        return repository.findAll(page);
    }

}
