/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dados.Aluno;
import estruturas_duplas.ContainerGenerico;
import estruturas_duplas.ListaDupla;
import estruturas_duplas.PilhaDupla;
import estruturas_simples.ListaSimples;

/**
 *
 * @author Vinicius
 */
public class Main {

    public static void main(String[] args) {

        long inicio;
        long fim;
        // write your code here
        PilhaDupla<Aluno> pilha = new PilhaDupla<>();
        Aluno aluno = new Aluno("Roberto", 13);
        pilha.insereNoFim(aluno);
        System.out.println(pilha.consultarFimInicio());
        pilha.esvaziaEstrutura();
        System.out.println(pilha.consultarFimInicio());
    }
}
