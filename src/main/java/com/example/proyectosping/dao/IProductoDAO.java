package com.example.proyectosping.dao;

import com.example.proyectosping.Modellenity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface IProductoDAO
        extends JpaRepository<Producto, Long> {
    public List<Producto> findByName(String name);
    public Optional<Producto> findById(Long id);
    public List<Producto> findAll();

}
