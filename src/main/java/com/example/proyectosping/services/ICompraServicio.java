package com.example.proyectosping.services;

import com.example.proyectosping.Modellenity.Compra;

import java.util.List;
import java.util.Optional;

public interface ICompraServicio {
    public List<Compra> findAll();
    public Compra save(Compra compra);
    public Optional<Compra> findById(Long id);
    public void deleteById(Long id);
}
