/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer;

/**
 *
 * @author aamandajuhl
 * @param <E>
 */
public interface IBuffer <E> {
    
    public void put(E element);
    public E get();
    public boolean isEmpty();
    public boolean isFull();
    
}
