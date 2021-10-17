package com.sofkau.apiwebflux.repositories;

import com.sofkau.apiwebflux.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio extends ReactiveMongoRepository<Dato, String> {
}

