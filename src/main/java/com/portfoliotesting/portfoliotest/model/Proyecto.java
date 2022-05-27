
package com.portfoliotesting.portfoliotest.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
@Table(name = "proyecto")

public class Proyecto implements Serializable {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Basic(optional = true)
    @Column(name = "idproyecto")
    private Long idproyecto;
    @Basic(optional = false)
    @Column(name = "proyecto_nombre")
    private String proyecto_nombre;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "url_proyecto")
    private String url_proyecto;
    @Column(name = "persona_idpersona")
    private Long persona_idpersona;
    
    public Proyecto() {
    }


    public Proyecto(Long idproyecto, String proyecto_nombre, String descripcion, 
            String url_proyecto, Long persona_idpersona) {
        this.idproyecto = idproyecto;
        this.proyecto_nombre = proyecto_nombre;
        this.descripcion = descripcion;
        this.url_proyecto = url_proyecto;
        this.persona_idpersona = persona_idpersona;
    }

   
}
