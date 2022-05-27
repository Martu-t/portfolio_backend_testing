package com.portfoliotesting.portfoliotest.service;

import com.portfoliotesting.portfoliotest.model.Persona;
import com.portfoliotesting.portfoliotest.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
    
    return persoRepo.findAll();
        
    }

    @Override
    public void crearPersona(Persona per) {
    
    persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
    persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
    return persoRepo.findById(id).orElse(null);
    }
  
}
