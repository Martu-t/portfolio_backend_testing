package com.portfoliotesting.portfoliotest.repository;

import com.portfoliotesting.portfoliotest.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    public void save(Long id);
}
