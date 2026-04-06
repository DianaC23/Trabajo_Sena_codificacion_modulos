/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Proyecto2.ejemplo2.Controller;

import com.Proyecto2.ejemplo2.Model.Aprendiz;
import com.Proyecto2.ejemplo2.Service.AprendizServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendiz")
public class Aprendizcontroller {
    @Autowired
    private AprendizServices aprendizServices;
    
    //Para crear un nuevo aprendiz
    @PostMapping("/nuevo")
    public Aprendiz newAprendiz(@RequestBody Aprendiz aprendiz){
    return this.aprendizServices.newAprendiz(aprendiz);}
    
    //Para mostrar la información contenida en la base de datos
    @GetMapping("/mostar")
    public Iterable<Aprendiz> getAll(){
    return aprendizServices.getAll();}
    
    //Pra modificar
    @PostMapping("/modificar")
    public Aprendiz updateAprendiz(@RequestBody Aprendiz aprendiz){
    return this.aprendizServices.modifyAprendiz(aprendiz);}
    
    //Borra aprendiz por id
    @PostMapping (value="/{id}")
    public Boolean deleteApreniz (@PathVariable(value="id")Long id){
    return this.aprendizServices.deleteAprendiz(id);}

    
}
