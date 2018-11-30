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
public abstract class ContainerGenerico<T> {

    protected int tamanho;
    protected NodoDuplo<T> primeiro;
    protected NodoDuplo<T> ultimo;

    public boolean isVazio() {
        return tamanho == 0;
    }

    public void esvaziaEstrutura() {
        primeiro = ultimo = null;
        tamanho = 0;
    }
    
    public T consultaElementoEm(int indice) throws EmptyListException, InvalidIndexException {
        if (isVazio()) {
            throw new EmptyListException("Lista vazia");
        }
        if (indice < 1 || indice > tamanho) {
            throw new InvalidIndexException("Index invalido");
        }
        int i = 1;
        NodoDuplo<T> nodo = primeiro;
        while (i < indice) {
            nodo = nodo.prox;
            i++;
        }
        return nodo.getDado();
    }
    
    public int getTamanho() {
        return tamanho;
    }
}
