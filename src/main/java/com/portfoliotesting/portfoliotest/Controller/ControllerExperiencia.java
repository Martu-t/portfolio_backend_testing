package com.portfoliotesting.portfoliotest.Controller;

import com.portfoliotesting.portfoliotest.model.Experiencia_laboral;
import com.portfoliotesting.portfoliotest.service.iExperienciaService;
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
public class ControllerExperiencia {
    
@Autowired
private iExperienciaService expServ;

// Experiencia
@GetMapping ("/ver/experiencia/{id}")
@ResponseBody
public Experiencia_laboral buscarExperiencia (@PathVariable Long id)
{
     return expServ.buscarExperiencia(id);
}

@PostMapping ("/new/experiencia")
public void agregarExperiencia (@RequestBody Experiencia_laboral exp) {
    expServ.crearExperiencia(exp);
} 
@GetMapping ("/ver/experiencia")    
@ResponseBody
public List<Experiencia_laboral> verExperiencia () {
    return expServ.verExperiencia();
}
@DeleteMapping ("/delete/experiencia/{id}")
public void borrarExperiencia (@PathVariable Long id) {
    expServ.borrarExperiencia(id);
    
}
@PutMapping ("/modificar/experiencia/{id}") 
public Experiencia_laboral modificarExperiencia (@RequestBody Experiencia_laboral exp, @PathVariable Long id) {  
                                
                           
                      Experiencia_laboral experienciaActual = expServ.buscarExperiencia(id);
                      experienciaActual.setNombre_empresa(exp.getNombre_empresa());
                      experienciaActual.setLugar(exp.getLugar());
                      experienciaActual.setPuesto(exp.getPuesto());
                      experienciaActual.setFecha_inicio(exp.getFecha_inicio());
                      experienciaActual.setFecha_fin(exp.getFecha_fin());
                      experienciaActual.setDescripcion_experiencia(exp.getDescripcion_experiencia());
                                 
                      expServ.crearExperiencia(experienciaActual);
                      return exp;
    //Experiencia_laboral exp = expServ.buscarExperiencia(id);
    //exp.setNombre_empresa(nuevoNombre);
    //exp.setPuesto(nuevoPuesto);

//expServ.crearExperiencia(exp);
//return exp;
}


}
