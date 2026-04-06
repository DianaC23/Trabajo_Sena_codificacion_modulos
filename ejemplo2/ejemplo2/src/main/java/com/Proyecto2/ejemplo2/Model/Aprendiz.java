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
    @Column
    private long iduser;
    @Column
    private String nomuser;
    @Column
    private String apellido;
    @Column
    private String email;
}
