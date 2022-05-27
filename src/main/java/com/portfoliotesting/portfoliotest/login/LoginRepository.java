package com.portfoliotesting.portfoliotest.login;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
      List<Login> findByNombre(String nombre);
}
