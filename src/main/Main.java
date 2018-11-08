/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import lista.*;
import estruturasestaticas.*;

/**
 *
 * @author Vinicius
 */
public class Main {
        public static void main(String[] args) {
	// write your code here
        Lista <Aluno> lista = new Lista <>("Lista de alunos");
        lista.insereNoFim(new Aluno("Cleber", 25));
        lista.insereNoFim(new Aluno("Vinicius", 18));
        lista.insereNoInicio(new Aluno("Suelen", 33));
        System.out.println(lista.visualizaLista());
        lista.removeDoInicio();
        System.out.println(lista);
        lista.removeDoFim();
        System.out.println(lista.visualizaLista());
    }
}
