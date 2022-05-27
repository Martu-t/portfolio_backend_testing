package com.portfoliotesting.portfoliotest.login;


import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService {
    @Autowired
    private LoginRepository loginRepo;
    
    public boolean isUserEnabled(Login login) {
        boolean isUserEnabled = false;
        List<Login> usuarios = loginRepo.findByNombre(login.getNombre());
        if (!usuarios.isEmpty()) {
            Login usuario = usuarios.get(0);
            if (usuario.getPassword().equals(login.getPassword())){
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }
    
}
