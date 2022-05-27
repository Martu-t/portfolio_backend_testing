package com.portfoliotesting.portfoliotest.Controller;

import com.portfoliotesting.portfoliotest.model.Skills;
import com.portfoliotesting.portfoliotest.service.ISkillsService;
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

public class ControllerSkills {
 
    @Autowired
    private ISkillsService skiServ; 
    
    // Skills
@GetMapping ("/ver/skills/{id}")    
@ResponseBody
public Skills buscarSkills (@PathVariable Long id) {
    return skiServ.buscarSkills(id);
}

@PostMapping ("/new/skills")
public void agregarSkills (@RequestBody Skills ski) {
    skiServ.crearSkills(ski);
} 
@GetMapping ("/ver/skills")    
@ResponseBody
public List<Skills> verSkills () {
    return skiServ.verSkills();
}
@DeleteMapping ("/delete/skills/{id}")
public void borrarSkills (@PathVariable Long id) {
    skiServ.borrarSkills(id);
    
}
@PutMapping ("/modificar/skills/{id}") 
public Skills modificarSkills (@RequestBody Skills ski, @PathVariable Long id) {
                                 
                                 Skills skillActual = skiServ.buscarSkills(id);
                                 skillActual.setSkill_nombre(ski.getSkill_nombre());
                                 skillActual.setSkill_porcentaje(ski.getSkill_porcentaje());
                                 //@RequestParam ("skills_nombre") String nuevaSkills,
                                 //@RequestParam ("skills_porcentaje") int nuevoPorcentaje)
                            
    //ski.setSkills_nombre(nuevaSkills);
    //ski.setSkills_porcentaje(nuevoPorcentaje);

skiServ.crearSkills(ski);
return ski;
}
    
}
