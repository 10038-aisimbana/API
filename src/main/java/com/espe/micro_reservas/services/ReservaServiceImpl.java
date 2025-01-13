package com.espe.micro_reservas.services;
import com.espe.micro_reservas.model.entities.Reserva;
import com.espe.micro_reservas.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaRepository repository;

    @Override
    public List<Reserva> findAll() {
        return (List<Reserva>) repository.findAll();
    }

    @Override
    public Optional<Reserva> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public Reserva save(Reserva reserva) {
        return repository.save(reserva);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}