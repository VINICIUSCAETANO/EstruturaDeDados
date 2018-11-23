/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas_simples;

import exception.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Vinicius
 */
public class ListaSimples<T> implements ListaSimplesI<T> {

    private NodoSimples<T> primeiro;
    private NodoSimples<T> ultimo;
    private String nome;
    private int size;

    public ListaSimples() {
        this("lista");
    }

    public ListaSimples(String nome) {
        this.nome = nome;
        primeiro = ultimo = null;
        size = 0;
    }

    @Override
    public void insereNoFim(T item) {
        long inicioTempo = System.nanoTime();
        if (isVazio()) {
            primeiro = ultimo = new NodoSimples<>(item);
        } else {
            ultimo.prox = ultimo = new NodoSimples<>(item, null);
        }
        size++;
        long fimTempo = System.nanoTime();
        long dur = (fimTempo - inicioTempo);
        System.out.println("Insercao levou: " + dur + " ms");
    }

    @Override
    public void insereNoInicio(T item) {
        long inicioTempo = System.nanoTime();
        if (isVazio()) {
            primeiro = ultimo = new NodoSimples<>(item);
        } else {
            primeiro = new NodoSimples<>(item, primeiro);
        }
        long fimTempo = System.nanoTime();
        long dur = (fimTempo - inicioTempo);
        System.out.println("Insercao levou: " + dur + " ms");
        size++;
    }

    @Override
    public String visualizaLista() throws EmptyListException {
        long inicioTempo = System.nanoTime();
        StringBuilder strbuilder = new StringBuilder(nome + "\n");
        if (isVazio()) {
            throw new EmptyListException("Lista vazia");
        }
        NodoSimples<T> aux = primeiro;
        while (aux != null) {
            strbuilder.append(aux.getDado());
            aux = aux.prox;
        }
        long fimTempo = System.nanoTime();
        long dur = (fimTempo - inicioTempo);
        System.out.println("Visualizacao levou: " + dur + " ms");
        return strbuilder.toString();
    }

    @Override
    public T removeDoInicio() throws EmptyListException {
        long inicioTempo = System.nanoTime();
        if (isVazio()) {
            throw new EmptyListException("Lista vazia");
        } else {
            size--;
            NodoSimples<T> aux = primeiro;
            primeiro = primeiro.prox;
            long fimTempo = System.nanoTime();
            long dur = (fimTempo - inicioTempo);
            System.out.println("Remocao levou: " + dur + " ns");
            return aux.getDado();
        }
    }

    @Override
    public T removeDoFim() throws EmptyListException {
        long inicioTempo = System.nanoTime();
        if (isVazio()) {
            throw new EmptyListException("Lista vazia");
        } else {
            size--;
            NodoSimples<T> aux = primeiro;
            while (aux.prox != ultimo) {
                aux = aux.prox;
            }
            T dado = aux.getDado();
            aux.prox = null;
            ultimo = aux;
            long fimTempo = System.nanoTime();
            long dur = (fimTempo - inicioTempo);
            System.out.println("Remocao levou: " + dur + " ns");
            return dado;
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isVazio() {
        return primeiro == null;
    }

    @Override
    public void esvaziaLista() {
        primeiro = ultimo = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder strbuilder = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("Lista vazia");
        }
        NodoSimples<T> aux = primeiro;
        while (aux != null) {
            strbuilder.append(aux.getDado());
            aux = aux.prox;
        }
        return strbuilder.toString();
    }
}
