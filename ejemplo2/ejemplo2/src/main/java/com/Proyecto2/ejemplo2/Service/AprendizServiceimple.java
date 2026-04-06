
package com.Proyecto2.ejemplo2.Service;

import com.Proyecto2.ejemplo2.Model.Aprendiz;
import com.Proyecto2.ejemplo2.Repository.AprendizRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AprendizServiceimple implements AprendizServices {
    @Autowired
    private AprendizRepository aprendizrepository;
//Agregar un nuevo aprendiz
    @Override
    public Aprendiz newAprendiz(Aprendiz newAprendiz) {
       return aprendizrepository.save(newAprendiz);
    }
//Encuentra todos los registros de la base de datos para que los muestre todos
    @Override
    public Iterable<Aprendiz> getAll() {
         return this.aprendizrepository.findAll();
    }

    @Override
    //Modifica o actualiza un aprendiz
    public Aprendiz modifyAprendiz(Aprendiz aprendiz) {
        Optional<Aprendiz> aprendizEncontrado=this.aprendizrepository.findById(aprendiz.getIduser());
        if (aprendizEncontrado.get()!=null){
        aprendizEncontrado.get().setNomuser(aprendiz.getNomuser());
        aprendizEncontrado.get().setApellido(aprendiz.getApellido());
        aprendizEncontrado.get().setEmail(aprendiz.getEmail());
        return this.newAprendiz(aprendizEncontrado.get());}
        return null;}

    @Override
    //Eliminar por ID
    public Boolean deleteAprendiz(Long iduser) {
        this.aprendizrepository.deleteById(iduser);
        return true;
    }
    
}
