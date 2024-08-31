package com.example.proyectosping.dao;

import com.example.proyectosping.Modellenity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface IClienteDAO
extends JpaRepository<Cliente, Long> {
    public List<Cliente> findByName(String name);
    public List<Cliente> findByid(Long id);
    public List<Cliente> findByIdAndName(Long id, String name);
    public  List<Cliente> findAll();


}
