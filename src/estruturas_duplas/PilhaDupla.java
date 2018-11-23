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
public class PilhaDupla<T> extends ContainerGenerico<T> {

    public PilhaDupla() {
        primeiro = ultimo = null;
        tamanho = 0;
    }

    public void insereNoFim(T item) {
        if (isVazio()) {
            primeiro = ultimo = new NodoDuplo<>(item);
        } else {
            NodoDuplo<T> aux = ultimo;
            ultimo = new NodoDuplo<>(item, null, aux);
            aux.setProx(ultimo);
        }
        tamanho++;
    }

    public T removeNoFim() throws EmptyListException {
        if (isVazio()) {
            throw new EmptyListException("Impossivel remover. Lista vazia");
        } else if (tamanho == 1) {
            tamanho = 0;
            NodoDuplo<T> aux = ultimo;
            primeiro = ultimo = null;
            return aux.getDado();
        } else {
            tamanho--;
            NodoDuplo<T> aux = ultimo;
            ultimo = ultimo.ant;
            ultimo.prox = null;
            return aux.getDado();
        }
    }

    public String consultarFimInicio() {
        StringBuilder strbf = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("Pilha Vazia");
        } else {
            NodoDuplo<T> aux = ultimo;
            while (aux != null) {
                strbf.append(aux.getDado());
                aux = aux.ant;
            }
        }
        return strbf.toString();
    }
}
