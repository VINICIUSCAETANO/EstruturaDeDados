/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas_duplas;

import exception.*;

/**
 *
 * @author Vinicius
 */
public class ListaDupla<T> extends ContainerGenerico<T> implements ListaDuplaI<T> {

    public ListaDupla() {
        primeiro = ultimo = null;
        tamanho = 0;
    }

    @Override
    public void insereNoInicio(T item) {
        long tempoInicio = System.nanoTime();
        if (isVazio()) {
            primeiro = ultimo = new NodoDuplo<>(item);
        } else {
            NodoDuplo<T> aux = primeiro;
            primeiro = new NodoDuplo<>(item, aux, null);
            aux.setAnt(primeiro);
        }
        long tempoFim = System.nanoTime();
        System.out.println("Tempo de insercao: " + (tempoFim - tempoInicio) + " ns\n");
        tamanho++;
    }

    @Override
    public void insereNoFim(T item) {
        long tempoInicio = System.nanoTime();
        if (isVazio()) {
            primeiro = ultimo = new NodoDuplo<>(item);
        } else {
            NodoDuplo<T> aux = ultimo;
            ultimo = new NodoDuplo<>(item, null, aux);
            aux.setProx(ultimo);
        }
        long tempoFim = System.nanoTime();
        System.out.println("Tempo de insercao: " + (tempoFim - tempoInicio) + " ns\n");
        tamanho++;
    }

    @Override
    public String consultarInicioFim() throws EmptyListException {
        long tempoInicio = System.nanoTime();
        StringBuilder strbf = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("lista Vazia");
        }

        NodoDuplo<T> aux = primeiro;
        while (aux != null) {
            strbf.append(aux.getDado());
            aux = aux.prox;
        }

        long tempoFim = System.nanoTime();
        System.out.println("Tempo de consulta: " + (tempoFim - tempoInicio) + " ns\n");
        return strbf.toString();
    }

    @Override
    public String consultarFimInicio() throws EmptyListException {
        long tempoInicio = System.nanoTime();
        StringBuilder strbf = new StringBuilder();

        if (isVazio()) {
            throw new EmptyListException("lista Vazia");
        }

        NodoDuplo<T> aux = ultimo;
        while (aux != null) {
            strbf.append(aux.getDado());
            aux = aux.ant;
        }

        long tempoFim = System.nanoTime();
        System.out.println("Tempo de consulta: " + (tempoFim - tempoInicio) + " ns\n");
        return strbf.toString();
    }

    @Override
    public T removerNoFim() {
        long tempoInicio = System.nanoTime();
        if (isVazio()) {
            throw new EmptyListException("Impossivel remover. Lista vazia");
        }

        if (tamanho == 1) {
            tamanho = 0;
            NodoDuplo<T> aux = ultimo;
            primeiro = ultimo = null;
            long tempoFim = System.nanoTime();
            System.out.println("Tempo de remocao: " + (tempoFim - tempoInicio) + " ns\n");
            return aux.getDado();
        } else {
            tamanho--;
            NodoDuplo<T> aux = ultimo;
            ultimo = ultimo.ant;
            ultimo.prox = null;
            long tempoFim = System.nanoTime();
            System.out.println("Tempo de remocao: " + (tempoFim - tempoInicio) + " ns\n");
            return aux.getDado();
        }
    }

    @Override
    public T remover(T item) throws EmptyListException {
        if (isVazio()) {
            throw new EmptyListException("Impossivel remover! Lista vazia");
        }

        if (tamanho == 1 && item.equals(primeiro.getDado())) {
            T dado = primeiro.getDado();
            esvaziaEstrutura();
            return dado;
        }
        if (tamanho == 2) {
            if (item.equals(primeiro.getDado())) {
                NodoDuplo<T> aux = primeiro;
                primeiro = ultimo;
                ultimo.ant = null;
                tamanho--;
                return aux.getDado();
            } else if (item.equals(ultimo.getDado())) {
                primeiro.prox = null;
                tamanho--;
                return ultimo.getDado();
            } else {
                return null;
            }
        }
        NodoDuplo<T> nodo = primeiro;
        while (nodo != null) {
            if (nodo.getDado().equals(item)) {
                //remove o nodo
                //tamanho--;
                return nodo.getDado();
            }
            nodo = nodo.prox;
        }
        return null;
    }
}
