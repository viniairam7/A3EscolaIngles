/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Airam
 */
public class User extends Pessoa {

    protected String email;
    protected String senha;

    public User(int id, String Nome, String email, String senha) {
        super(id, Nome);
        this.id = id;
        this.email = email;
        this.senha = senha;
    }

    public User(String email, String senha, int id, String Nome, int CPF, int telefone) {
        super(id, Nome, CPF, telefone);
        this.email = email;
        this.senha = senha;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    
}
    
    