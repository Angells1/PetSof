/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author gabri
 */
public abstract class Animal {
    
     private String nome;
    private String nomeDono;
    private int idade;
    private String raca;
    private String permanencia;
    
    /*public Animal(String nome, String nomeDono, int idade, String raca, String permanencia){

        this.nome = nome;
        this.nomeDono = nomeDono;
        this.idade = idade;
        this.permanencia = permanencia;
        this.raca = raca;
        
        
    } */
   /* public Animal(String nome, String nomeDono, String permanencia){

        this.nome = nome;
        this.nomeDono = nomeDono;
 
        this.permanencia = permanencia;

        
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPermanencia() {
        return permanencia;
    }

    public void setPermanencia(String permanencia) {
        this.permanencia = permanencia;
    }
    
}
