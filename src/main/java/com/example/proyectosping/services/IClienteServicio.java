package com.example.proyectosping.services;

import com.example.proyectosping.Modellenity.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> findAll();
    public Cliente save(Cliente cliente);
    public Cliente findById(Long id);
    public void deleteById(Long id);
    public void findByIdAndName(Long id, String name);
}
