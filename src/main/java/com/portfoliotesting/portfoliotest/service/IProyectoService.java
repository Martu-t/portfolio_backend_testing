package com.portfoliotesting.portfoliotest.service;

import com.portfoliotesting.portfoliotest.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
        
    public List<Proyecto> verProyecto();
    
    public void crearProyecto (Proyecto pro);
    
    public void borrarProyecto (Long id);
    
    public Proyecto buscarProyecto (Long id);


    
}
