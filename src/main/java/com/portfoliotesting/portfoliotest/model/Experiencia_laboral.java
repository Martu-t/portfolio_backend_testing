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
public class Experiencia_laboral implements Serializable  {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idexperiencia_laboral;
    
    private String nombre_empresa;
    private String lugar;
    private String puesto;
    private String es_trabajo_actual;
    private String fecha_inicio;
    private String fecha_fin;
    private String descripcion_experiencia;
    //private String tipo_empleo;
    private Long persona_idpersona;
    private Long tipo_empleo_idtipo_empleo;
    
public Experiencia_laboral() {
}

   public Experiencia_laboral(Long idexperiencia_laboral, String nombre_empresa, 
           String lugar, String puesto, 
           String es_trabajo_actual, String fecha_inicio, String fecha_fin, 
           String descripcion_experiencia,
           //String tipo_empleo, 
          Long persona_idpersona,
          Long tipo_empleo_idtipo_empleo) {
        this.idexperiencia_laboral = idexperiencia_laboral;
        this.nombre_empresa = nombre_empresa;
        this.lugar = lugar;
        this.puesto = puesto;
        this.es_trabajo_actual = es_trabajo_actual;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.descripcion_experiencia = descripcion_experiencia;
        //this.tipo_empleo = tipo_empleo;
        this.persona_idpersona = persona_idpersona;
        this.tipo_empleo_idtipo_empleo = tipo_empleo_idtipo_empleo;
    }

}