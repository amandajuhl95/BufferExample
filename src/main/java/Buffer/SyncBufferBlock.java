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
class SyncBufferBlock<E> implements ISyncBuffer<E> {

    private final IBuffer<E> buffer;

    SyncBufferBlock(int size) {

        this.buffer = null;//new BufferBlock(size);
    }

    @Override
    public synchronized void put(E element) throws InterruptedException {

        while (buffer.isFull()) {
            wait();
        }
        buffer.put(element);
        notifyAll();  
    }

    @Override
    public synchronized E get() throws InterruptedException {

        while (buffer.isEmpty()) {
            wait();
        }
        notifyAll();
        return buffer.get();
    }

}
