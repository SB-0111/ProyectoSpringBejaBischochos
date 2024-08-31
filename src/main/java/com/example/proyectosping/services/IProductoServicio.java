package com.example.proyectosping.services;
import com.example.proyectosping.Modellenity.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> findAll();
    public Producto save(Producto producto);
    public Producto findById(Long id);
    public void deleteById(Long id);
}
