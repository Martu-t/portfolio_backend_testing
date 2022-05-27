package com.portfoliotesting.portfoliotest.Controller;

import com.portfoliotesting.portfoliotest.model.Persona;
import com.portfoliotesting.portfoliotest.service.IPersonaService;
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
public class CotrollerPersona {

@Autowired
private IPersonaService persoServ;

@PostMapping ("/new/persona")
public void agregarPersona (@RequestBody Persona pers) {
    persoServ.crearPersona(pers);
} 
@GetMapping ("/ver/personas")    
@ResponseBody
public List<Persona> verPersona () {
    return persoServ.verPersonas();
}
@DeleteMapping ("/delete/persona/{id}")
public void borrarPersona (@PathVariable Long id) {
    persoServ.borrarPersona(id);
    
}
@PutMapping ("/modificar/persona/{id}") 
public Persona modificarPersona (@RequestBody Persona pers, @PathVariable Long id)  {
                                 
    Persona PersonaActual = persoServ.buscarPersona(id);
    PersonaActual.setNombre(pers.getNombre());
    PersonaActual.setApellido(pers.getApellido());
    PersonaActual.setResidencia(pers.getResidencia());
    PersonaActual.setFecha_nacimiento(pers.getFecha_nacimiento());
    PersonaActual.setTelefono(pers.getTelefono());
    PersonaActual.setEmail(pers.getEmail());
    PersonaActual.setSobre_mi(pers.getSobre_mi());
    PersonaActual.setUrl_foto(pers.getUrl_foto());
    PersonaActual.setUrl_banner(pers.getUrl_banner());
         
    //Persona pers = persoServ.buscarPersona(id);
    //pers.setNombre(nuevoNombre);
    //pers.setApellido(nuevoApellido);
  
persoServ.crearPersona(pers);
return pers;
}

@GetMapping ("/ver/persona/{id}")
@ResponseBody
public Persona buscarPersona (@PathVariable Long id) {
return persoServ.buscarPersona(id);
}
    
}
