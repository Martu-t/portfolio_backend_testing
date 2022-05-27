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
//@Table(name = "Educacion")
public class Educacion implements Serializable  {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ideducacion;
    
    private String nombre_carrera;
    private String nombre_instituto;
    private String fecha_inicio;
    private String fecha_fin;
    private String url_foto_edu;
    private Long persona_idpersona;

    //@JsonIgnoreProperties("educacacion")
    //@ManyToOne(optional = false)
    //private Persona persona;
    
    public Educacion() {
    }
    
    public Educacion(Long ideducacion, String nombre_carrera, 
            String nombre_instituto, String fecha_inicio,
            String fecha_fin, String url_foto_edu,
            Long persona_idpersona) {
        
            this.ideducacion = ideducacion;
            this.nombre_carrera = nombre_carrera;
            this.nombre_instituto = nombre_instituto;
            this.fecha_inicio = fecha_inicio;
            this.fecha_fin = fecha_fin;
            this.url_foto_edu = url_foto_edu;
            this.persona_idpersona = persona_idpersona;
    }

}
