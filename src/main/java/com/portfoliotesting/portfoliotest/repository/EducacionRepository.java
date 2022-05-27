
package com.portfoliotesting.portfoliotest.repository;

import com.portfoliotesting.portfoliotest.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long> {
 
    public void save(Long id);
    
}
