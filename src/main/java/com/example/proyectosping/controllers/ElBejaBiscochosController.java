package com.example.proyectosping.controllers;

import com.example.proyectosping.Modellenity.Cliente;
import com.example.proyectosping.services.IClienteServicio;
import com.example.proyectosping.Modellenity.Compra;
import com.example.proyectosping.services.ICompraServicio;
import com.example.proyectosping.Modellenity.Producto;
import com.example.proyectosping.services.IProductoServicio;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.ClientInfoStatus;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ElBejaBiscochosController {

    @Autowired
    private IProductoServicio productoService;

    @Autowired
    private IClienteServicio clienteService;

    @Autowired
    private ICompraServicio compraService;

    // Otros métodos para Productos y Clientes

    // Métodos para Compras

    @GetMapping("/compras")
    public List<Compra> getCompras() {
        return compraService.findAll();
    }

    @PostMapping("/compras")
    public ResponseEntity<?> postCompra(@RequestBody Compra compra) {
        Map<String, String> response = new HashMap<>();
        try {
            // Validar existencia del cliente
            Cliente cliente = clienteService.findById(compra.getCliente().getId());
            if (cliente == null) {
                response.put("mensaje", "Cliente no encontrado");
                return ResponseEntity.status(404).body(response);
            }

            // Validar existencia del producto
            Producto producto = productoService.findById(compra.getProducto().getId());
            if (producto == null) {
                response.put("mensaje", "Producto no encontrado");
                return ResponseEntity.status(404).body(response);
            }

            // Asignar cliente y producto validados a la compra
            compra.setCliente(cliente);
            compra.setProducto(producto);

            compraService.save(compra);
        } catch (Exception e) {
            response.put("mensaje", "Error al guardar la compra");
            return ResponseEntity.status(500).body(response);
        }

        return ResponseEntity.status(201).body(compra);
    }

    @DeleteMapping("/compras/{id}")
    public ResponseEntity<?> deleteCompra(@PathVariable Long id) {
        Map<String, String> response = new HashMap<>();
        try {
            compraService.deleteById(id);
        } catch (Exception e) {
            response.put("mensaje", "Error al eliminar la compra");
            return ResponseEntity.status(500).body(response);
        }
        response.put("mensaje", "Compra eliminada con éxito");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/compras/{id}")
    public ResponseEntity<?> getCompraById(@PathVariable Long id) {
        Optional<Compra> compraOpt = compraService.findById(id);
        if (compraOpt.isEmpty()) {
            Map<String, String> response = new HashMap<>();
            response.put("mensaje", "No se encontró la compra");
            return ResponseEntity.status(404).body(response);
        }
        return ResponseEntity.ok(compraOpt.get());
    }
}
