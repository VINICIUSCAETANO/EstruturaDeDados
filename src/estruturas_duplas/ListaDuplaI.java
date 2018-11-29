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
public interface ListaDuplaI<T> {
    void insereNoInicio(T item);
    void insereNoFim(T item);
    String consultarInicioFim() throws EmptyListException;
    String consultarFimInicio() throws EmptyListException;
    String remover(T item);
}
