/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import exception.EmptyListException;

/**
 *
 * @author Vinicius
 */
public interface PilhaI<T> {
    
    public void insereNoFim(T item);

    public String visualizaPilha() throws EmptyListException;

    public T removeDoFim() throws EmptyListException;

    public void esvaziaPilha();
}
