/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_testes;

import dados.Aluno;
import dados.Jogo;
import estruturas_duplas.ContainerGenerico;
import estruturas_duplas.ListaDupla;
import estruturas_duplas.PilhaDupla;
import estruturas_simples.ListaSimples;
import exception.EmptyListException;

/**
 *
 * @author Vinicius
 */
public class Testes {

    public static void main(String[] args) {
        ListaSimples<Aluno> lista = new ListaSimples<>();
        for (int i = 0; i < 100; i++) {
            lista.insereNoInicio(new Aluno("Abbada", i));
        }
        System.out.println("Removendo");
        for (int i = 0; i < 99; i++) {
            lista.removeDoFim();
        }
        
        ListaDupla<Jogo> listaJogos = new ListaDupla<>();
        try {
            listaJogos.consultarInicioFim();
        } catch (EmptyListException e) {
            System.out.println("Deu erro de lista vazia");
        }
    }
}
