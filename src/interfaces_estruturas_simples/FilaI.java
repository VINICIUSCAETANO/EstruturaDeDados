/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces_estruturas_simples;

import exception.EmptyListException;

/**
 *
 * @author Vinicius
 */
public interface FilaI<T> {
    
    public void insereNoInicio(T item);

    public String visualizaFila() throws EmptyListException;

    public T removeDoFim() throws EmptyListException;

    public void esvaziaFila();
}
