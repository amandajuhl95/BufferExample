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
public interface ISyncBuffer <E> {
    
    public void put(E element) throws InterruptedException;
    public E get() throws InterruptedException;
    
}
