package it.unibo.inner.impl;

import java.util.Iterator;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private T[] list;

    public IterableWithPolicyImpl(final T[] list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        IteratorImpl test = new IteratorImpl();
        return test;
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIterationPolicy'");
    }

    private class IteratorImpl implements Iterator<T> {

        private int current;

        @Override
        public boolean hasNext() {
            return (current + 1 < list.length);
        }
        @Override
        public T next() {
            return list[this.current++];
        }
        
    }
    
}
