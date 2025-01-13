package com.espe.micro_reservas.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
@Table(name = "reservas")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @NotBlank(message = "El cliente no puede estar vacío")
    private String cliente;

    @Column(nullable = false)
    @NotBlank(message = "El servicio no puede estar vacío")
    private String servicio;

    @Column(nullable = false)
    @Min(value = 1, message = "El número de personas debe ser al menos 1")
    private int personas;

    @Column(nullable = false)
    @NotNull(message = "La fecha de reserva no puede ser nula")
    @Future(message = "La fecha de reserva debe ser en el futuro")
    @Temporal(TemporalType.DATE)
    private Date fechaReserva;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }
}

