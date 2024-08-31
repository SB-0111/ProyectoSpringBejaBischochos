package com.example.proyectosping.Modellenity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity()
@Table(name="Productos")
@Getter
@Setter

public class Producto {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name="name")
        @Getter
        @Setter
        @Size(min=3, max=50, message="El nombre debe tener entre 3 y 50 caracteres")
        private String name;

        @Column(name="description")
        @Getter
        @Setter
        private String description;

        @Column(name="stock")
        @Getter
        @Setter
        private int stock;

        @Column(name="Precio")
        @Getter
        @Setter
        private Double Precio;

}
