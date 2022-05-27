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
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idpersona;
    
    private String nombre;
    private String apellido;
    private String residencia;
    private String fecha_nacimiento;
    private String telefono;
    private String email;
    private String sobre_mi;
    private String url_foto;
    private String url_banner;
    
    //@JsonIgnoreProperties("persona")
    //@OneToMany(mappedBy = "persona", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private Set<Educacion> educations = new HashSet<>();
    
    public Persona() {
    }
    
    public Persona(Long idpersona, String nombre, String apellido, String residencia,
            String fecha_nacimiento, String telefono, String email, String sobre_mi, 
            String url_foto, String url_banner) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.residencia = residencia;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.email = email;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.url_banner = url_banner;
    }
}
