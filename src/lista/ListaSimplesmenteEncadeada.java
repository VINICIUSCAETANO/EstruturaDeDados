/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import exception.*;

/**
 *
 * @author Vinicius
 */
public interface ListaSimplesmenteEncadeada<T> {
    void insereNoFim(T item);

    void insereNoInicio(T item);

    String visualizaLista() throws EmptyListException;
     
    T removeDoInicio() throws EmptyListException;

    T removeDoFim() throws EmptyListException;

    boolean isVazio();
}
