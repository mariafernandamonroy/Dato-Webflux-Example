package com.sofkau.apiwebflux.usecase;

import com.sofkau.apiwebflux.dto.DatoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarDato {
    public Mono<String> apply(DatoDTO datoDTO);
}
