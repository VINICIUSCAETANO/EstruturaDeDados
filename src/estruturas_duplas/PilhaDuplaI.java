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
public interface PilhaDuplaI<T> {
    void empilharItem(T item);
    T desempilharItem() throws EmptyListException;
    T verTopoItem() throws EmptyListException;
    String consultarPilha() throws EmptyListException;
}
