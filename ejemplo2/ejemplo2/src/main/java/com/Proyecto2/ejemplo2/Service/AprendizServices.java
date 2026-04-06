/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Proyecto2.ejemplo2.Service;

import com.Proyecto2.ejemplo2.Model.Aprendiz;

/**
 *
 * @author diana
 * Permite hacer la creación de los metodos:crear,borrar,modificar,leer
 */
public interface AprendizServices {
    Aprendiz newAprendiz (Aprendiz newAprendiz);
    Iterable<Aprendiz> getAll();//Busqueda
    Aprendiz modifyAprendiz (Aprendiz aprendiz);//Modificar
    Boolean deleteAprendiz (Long iduser);//Recibe falso y verdadero para saber si se elimino
}
