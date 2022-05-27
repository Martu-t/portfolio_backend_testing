package com.portfoliotesting.portfoliotest.repository;

import com.portfoliotesting.portfoliotest.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository <Skills, Long> {
    
    public void save(Long id);
}
