/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Vinicius
 */
public class Aluno {
    private String nome;
    private int idade;

    public Aluno() {
        nome = "";
        idade = 0;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno: " + "nome = " + nome + ", idade = " + idade + '\n';
    }
    
}
