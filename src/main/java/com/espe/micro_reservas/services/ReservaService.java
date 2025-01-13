package com.espe.micro_reservas.services;

import com.espe.micro_reservas.model.entities.Reserva;

import java.util.List;
import java.util.Optional;

public interface ReservaService {
    List<Reserva> findAll();
    Optional<Reserva> findById(int id);
    Reserva save(Reserva reserva);
    void deleteById(int id);
}