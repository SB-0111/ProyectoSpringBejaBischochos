package com.example.proyectosping.services;

import com.example.proyectosping.Modellenity.Cliente;
import com.example.proyectosping.dao.IClienteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteServicio {

    @Autowired
    private IClienteDAO clienteDAO;


    @Override
    public List<Cliente> findAll() {
        return clienteDAO.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteDAO.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return clienteDAO.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Long id) {
        clienteDAO.deleteById(id);
    }

    @Override
    public void findByIdAndName(Long id, String name) {
        clienteDAO.findByIdAndName(id, name);
    }
}
