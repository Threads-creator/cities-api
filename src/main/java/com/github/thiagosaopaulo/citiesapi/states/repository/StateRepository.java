package com.github.thiagosaopaulo.citiesapi.states.repository;

import com.github.thiagosaopaulo.citiesapi.states.entitys.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
