/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author max
 */
public class Usuario {
    private int id;
    private String nome;
    private String psw;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getPsw() {
        return psw;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public Usuario() {
    }

    public Usuario(int id, String nome, String psw) {
        this.id = id;
        this.nome = nome;
        this.psw = psw;
    }
    
    
    
    
}
