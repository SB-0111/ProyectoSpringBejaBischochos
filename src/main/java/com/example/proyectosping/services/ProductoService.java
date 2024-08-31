package com.example.proyectosping.services;

import com.example.proyectosping.Modellenity.Compra;
import com.example.proyectosping.Modellenity.Producto;
import com.example.proyectosping.dao.ICompraDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoServicio {

    @Autowired
    private IProductoServicio compraDAO;

    @Override
    public List<Producto> findAll() {
        return compraDAO.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return compraDAO.save(producto);
    }

    @Override
    public Producto findById(Long id) {
        return compraDAO.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        compraDAO.deleteById(id);
    }
}