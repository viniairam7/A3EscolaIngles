package controller;

import view.Login;
import view.MenuPrincipal;

public class LoginController {
    private final Login view;

    public LoginController(Login view) {
        this.view = view;
    }
    
   
    public void verificarLogin() {
        abrirMenuPrincipal();
    }

    
    private void abrirMenuPrincipal() {
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        view.setVisible(false);
    }
}

        
    
    
    
    

