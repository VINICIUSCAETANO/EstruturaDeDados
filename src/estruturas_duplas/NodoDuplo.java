/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas_duplas;

/**
 *
 * @author Vinicius
 */
public class NodoDuplo<T> {
    
    protected T dado;
    protected NodoDuplo<T> prox;
    protected NodoDuplo<T> ant;

    public NodoDuplo(T dado) {
        this.dado = dado;
        prox = ant = null;
    }

    public NodoDuplo(T dado, NodoDuplo<T> prox, NodoDuplo<T> ant) {
        this.dado = dado;
        this.prox = prox;
        this.ant = ant;
    }
    
    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public NodoDuplo<T> getProx() {
        return prox;
    }

    public void setProx(NodoDuplo<T> prox) {
        this.prox = prox;
    }

    public NodoDuplo<T> getAnt() {
        return ant;
    }

    public void setAnt(NodoDuplo<T> ant) {
        this.ant = ant;
    }
}
