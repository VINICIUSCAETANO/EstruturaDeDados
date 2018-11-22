/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas_simples;

/**
 *
 * @author Vinicius
 */
public class NodoSimples<T> {
    private T dado;
    public NodoSimples<T> prox;

    NodoSimples(T dado){
        this(dado,null);
    }
    NodoSimples(T dado, NodoSimples<T> prox){
        this.dado = dado;
        this.prox = prox;
    }

    public T getDado() {
        return dado;
    }

    public NodoSimples<T> getProx() {
        return prox;
    }
}
