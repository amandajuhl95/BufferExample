/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buffer;

/**
 *
 * @author aamandajuhl
 */
class BufferBlock<E> implements IBuffer<E> {

    private int size;
    private int target;
    private final E[] array;

    BufferBlock(int size) {

        this.array = (E[]) new Object[size];
        this.size = 0;
        this.target = 0;
    }

    @Override
    public void put(E element){
        
    }

    @Override
    public E get(){
       
      return array[target];  
     
    }

    @Override
    public boolean isFull() {
       return array.length == size;
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
