package com.portfoliotesting.portfoliotest.service;

import com.portfoliotesting.portfoliotest.model.Experiencia_laboral;
import java.util.List;


public interface iExperienciaService {
    
    public List<Experiencia_laboral> verExperiencia();
    
    public void crearExperiencia (Experiencia_laboral exp);
    
    public void borrarExperiencia (Long id);
    
    public Experiencia_laboral buscarExperiencia (Long id);

    
}
