/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas_duplas;

import exception.EmptyListException;

/**
 *
 * @author Vinicius
 */
public class PilhaDupla<T> extends ContainerGenerico<T> implements PilhaDuplaI<T> {

    public PilhaDupla() {
        primeiro = ultimo = null;
        tamanho = 0;
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
    public T removeNoFim() throws EmptyListException {
        long tempoInicio = System.nanoTime();
        if (isVazio()) {
            throw new EmptyListException("Impossivel remover. Lista vazia");
        } else if (tamanho == 1) {
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
    public String consultarFimInicio() {
        long tempoInicio = System.nanoTime();
        StringBuilder strbf = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("Pilha Vazia");
        } else {
            NodoDuplo<T> aux = ultimo;
            while (aux != null) {
                strbf.append(aux.getDado());
                aux = aux.ant;
            }
            long tempoFim = System.nanoTime();
            System.out.println("Tempo de consulta " + (tempoFim - tempoInicio) + " ns\n");
        }
        return strbf.toString();
    }
}
