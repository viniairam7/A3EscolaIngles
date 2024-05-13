
package model;

abstract class Pessoa {
    public int id;
    private String Nome;
    private int CPF;
    private int telefone;
    
    public Pessoa (int id, String Nome){
    this.id = id;
    this.Nome = Nome;
    }

    public Pessoa(int id, String Nome, int CPF, int telefone) {
        this.id = id;
        this.Nome = Nome;
        this.CPF = CPF;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
