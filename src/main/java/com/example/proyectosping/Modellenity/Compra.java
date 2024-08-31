package com.example.proyectosping.Modellenity;

import com.fasterxml.jackson.databind.DatabindException;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Entity()
@Table(name="Compras")
@Getter
@Setter

public class Compra {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="Fecha")
    @Getter
    @Setter
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;
    @Column(name="precio")
    @Getter
    @Setter
    private Double precio;
    @Column(name="cantidad")
    @Getter
    @Setter
    private int cantidad;
    @Column(name="total")
    @Getter
    @Setter
    private Double total;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;



}
