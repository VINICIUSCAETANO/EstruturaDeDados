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
public interface FilaDuplaI<T> {
    void enfileirarItem(T item);
    T desenfileirarItem() throws EmptyListException;
    String consultarFila() throws EmptyListException;
}
