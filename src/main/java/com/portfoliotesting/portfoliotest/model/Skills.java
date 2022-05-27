package com.portfoliotesting.portfoliotest.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    
    private Long idskill;
    private String skill_nombre;
    private int skill_porcentaje;
    private Long persona_idpersona;

    public Skills() {
    }
    
    public Skills (Long idskills, String skill_nombre, int skill_porcentaje,
                    Long persona_idpersona) {
        this.idskill = idskills;
        this.skill_nombre = skill_nombre;
        this.skill_porcentaje = skill_porcentaje;
        this.persona_idpersona = persona_idpersona;
        
    }
}

    
