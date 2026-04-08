/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto2.ejemplo2.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author diana
 */
@Entity
@Data
public class Aprendiz {
    //Crear elementos de la tabla Aprendiz
    @Id
    @Column (name="Id Aprendiz")
    private long iduser;
    @Column (name="Nombres", nullable=false,length=20)
    private String nomuser;
    @Column (name="Apellidos", nullable=false,length=25)
    private String apellido;
    @Column (name="Correo Electronico", unique=true,nullable=false)
    private String email;
}
