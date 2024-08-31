package com.example.proyectosping.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.proyectosping.Modellenity.Compra;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ICompraDAO extends JpaRepository<Compra, Long>{

    public List<Compra> findByFecha(Date fecha);
    public List<Compra> findByTotal(Double total);
    public Optional<Compra> findById(Long id);
    public List<Compra> findAll();

}
