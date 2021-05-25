package com.github.thiagosaopaulo.citiesapi.states.resources;

import com.github.thiagosaopaulo.citiesapi.states.entitys.State;
import com.github.thiagosaopaulo.citiesapi.states.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private StateRepository repository;

//    @GetMapping
//    public List<State> states(){
//        return repository.findAll();
//    }
    @GetMapping
    public Page<State> getStates(Pageable page){
        return repository.findAll(page);
    }

}
