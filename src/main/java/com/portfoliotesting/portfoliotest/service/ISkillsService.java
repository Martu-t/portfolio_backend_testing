package com.portfoliotesting.portfoliotest.service;

import com.portfoliotesting.portfoliotest.model.Skills;
import java.util.List;


public interface ISkillsService {
    
    public List<Skills> verSkills();
    
    public void crearSkills (Skills ski);
    
    public void borrarSkills (Long id);
    
    public Skills buscarSkills (Long id);
}
