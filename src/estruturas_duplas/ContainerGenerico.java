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
    
    public int getTamanho() {
        return tamanho;
    }
}
