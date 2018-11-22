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
public class FilaDupla<T> extends ContainerGenerico<T> {

    public FilaDupla() {
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

    public T removeNoFim() {
        T item = null;
        return item;
        //falta implementar
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
}
