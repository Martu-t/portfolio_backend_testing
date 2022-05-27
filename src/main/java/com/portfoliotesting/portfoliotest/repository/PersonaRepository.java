package com.portfoliotesting.portfoliotest.repository;

import com.portfoliotesting.portfoliotest.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {

    public void save(Long id);
    
}
