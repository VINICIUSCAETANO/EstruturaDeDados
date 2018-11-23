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
public class ListaDupla<T> extends ContainerGenerico<T> {
    
    public ListaDupla() {
        primeiro = ultimo = null;
        tamanho = 0;
    }

    public void insereNoInicio(T item) {
        if (isVazio()) {
            primeiro = ultimo = new NodoDuplo<>(item);
        } else {
            NodoDuplo<T> aux = primeiro;
            primeiro = new NodoDuplo<>(item, aux, null);
            aux.setAnt(primeiro);
        }
        tamanho++;
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

    public String consultarInicioFim() throws EmptyListException {
        StringBuilder strbf = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("lista Vazia");
        } else {
            NodoDuplo<T> aux = primeiro;
            while (aux != null) {
                strbf.append(aux.getDado());
                aux = aux.prox;
            }
        }
        return strbf.toString();
    }
    
    public String consultarFimInicio() throws EmptyListException {
        StringBuilder strbf = new StringBuilder();
        if (isVazio()) {
            throw new EmptyListException("lista Vazia");
        } else {
            NodoDuplo<T> aux = ultimo;
            while (aux != null) {
                strbf.append(aux.getDado());
                aux = aux.ant;
            }
        }
        return strbf.toString();
    }
    
    public T remover(String nome) {
        //TODO: logica de remocao de um nodo
        T item = null;
        return item;
    }
}
