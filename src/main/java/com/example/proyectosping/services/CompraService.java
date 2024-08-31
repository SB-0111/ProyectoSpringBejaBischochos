package com.example.proyectosping.services;


import com.example.proyectosping.Modellenity.Compra;
import com.example.proyectosping.dao.ICompraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService implements ICompraServicio {

    @Autowired
    private ICompraDAO compraDAO;

    @Override
    public List<Compra> findAll() {
        return compraDAO.findAll();
    }

    @Override
    public Compra save(Compra compra) {
         return compraDAO.save(compra);
    }

    @Override
    public Optional<Compra> findById(Long id) {
        return compraDAO.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        compraDAO.deleteById(id);
    }
}