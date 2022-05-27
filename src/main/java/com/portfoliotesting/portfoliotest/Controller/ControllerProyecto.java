package com.portfoliotesting.portfoliotest.Controller;


import com.portfoliotesting.portfoliotest.model.Proyecto;
import com.portfoliotesting.portfoliotest.service.IProyectoService;


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

public class ControllerProyecto {
    
@Autowired
private IProyectoService proServ;
//@Autowired
//private ILoginService loginServ;

// Proyecto
@GetMapping ("/ver/proyecto/{id}")    
@ResponseBody
public Proyecto buscarProyecto (@PathVariable Long id) {
    return proServ.buscarProyecto(id);
}

@PostMapping ("/new/proyecto")
public void agregarProyecto (@RequestBody Proyecto pro) {
    proServ.crearProyecto(pro);
} 
@GetMapping ("/ver/proyectos")    
@ResponseBody
public List<Proyecto> verProyecto() {
    return proServ.verProyecto();
}
@DeleteMapping ("/delete/proyecto/{id}")
public void borrarProyecto (@PathVariable Long id) {
    proServ.borrarProyecto(id);
    
}
@PutMapping ("/modificar/proyecto/{id}") 
public Proyecto modificarPoyecto (@RequestBody Proyecto pro, @PathVariable Long id) {  
                                 //@RequestBody Persona pers) {
                                 
                                 Proyecto proyectoActual = proServ.buscarProyecto(id);
                                 proyectoActual.setProyecto_nombre(pro.getProyecto_nombre());
                                 proyectoActual.setDescripcion(pro.getDescripcion());
                                 proyectoActual.setUrl_proyecto(pro.getUrl_proyecto());
                                 //@RequestParam ("proyectoNombre") String nuevoNombre,
                                 //@RequestParam ("descripcion") String nuevaDescripcion, 
                                 //@RequestParam ("urlProyecto") String nuevaUrl) {
    
    
    //pro.setProyectoNombre(nuevoNombre);
    //pro.setDescripcion(nuevaDescripcion);
    //pro.setUrlProyecto(nuevaUrl);

proServ.crearProyecto(pro);
return pro;
}
    //LOGIN
//@PostMapping("/login")
//public boolean isUserEnabled(@RequestBody Login login) {
  //      return loginServ.isUserEnabled(login);
    //}

}