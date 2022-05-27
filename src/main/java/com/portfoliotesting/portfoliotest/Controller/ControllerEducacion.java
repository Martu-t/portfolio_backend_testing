package com.portfoliotesting.portfoliotest.Controller;

import com.portfoliotesting.portfoliotest.model.Educacion;
import com.portfoliotesting.portfoliotest.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
        //(origins = "http://localhost:4200")

public class ControllerEducacion {
 
    @Autowired
    private IEducacionService eduServ;
    
// Educacion
@GetMapping ("/ver/educacion/{id}")    
@ResponseBody
public Educacion buscarEducacion (@PathVariable Long id) {
    return eduServ.buscarEducacion(id);
}

@PostMapping ("/new/educacion")
public void agregarEducacion (@RequestBody Educacion edu) {
    eduServ.crearEducacion(edu);
} 
@GetMapping ("/ver/educacion")    
@ResponseBody
public List<Educacion> verEducacion () {
    return eduServ.verEducacion();
}
@DeleteMapping ("/delete/educacion/{id}")
public void borrarEducacion (@PathVariable Long id) {
    eduServ.borrarEducacion(id);
    
}
@PutMapping ("/modificar/educacion/{id}") 
public Educacion modificarEducacion (@RequestBody Educacion edu, @PathVariable Long id) { 
                                 
                                 Educacion educacionActual = eduServ.buscarEducacion(id);
                                 educacionActual.setNombre_carrera(edu.getNombre_carrera());
                                 educacionActual.setNombre_instituto(edu.getNombre_instituto());
                                 educacionActual.setFecha_inicio(edu.getFecha_inicio());
                                 educacionActual.setFecha_fin(edu.getFecha_fin());
                                 educacionActual.setUrl_foto_edu(edu.getUrl_foto_edu());

eduServ.crearEducacion(edu);
return edu;
}
   
}
