package com.example.proyectosping.Modellenity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity()
@Table(name="clientes")
@Getter
@Setter

public class Cliente {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="Direccion")
    @Setter
    @Getter
    private String Direccion;
    @Column(name="name")
    @Getter
    @Setter
    @Size(min=3, max=50, message="El nombre debe tener entre 3 y 50 caracteres")
    private String name;
    @Column(name="Email")
    @Getter
    @Setter
    @Email
    private String Email;
    @Column(name="Telefono")
    @Getter
    @Setter
    private String Telefono;
}
