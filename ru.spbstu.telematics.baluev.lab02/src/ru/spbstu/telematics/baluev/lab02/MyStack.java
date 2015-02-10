package ru.spbstu.telematics.baluev.lab02;

import java.util.EmptyStackException;
import java.util.Iterator;

public class MyStack<T> implements IStack, Iterable<T>{
	
	private T[] arr;
	private int size;
	private int position;
	private int currentsize;
	    
	public void Stack(){
		this.currentsize=10;
        this.position = 0;       
        this.size=0;
	    @SuppressWarnings("unchecked")
		T[] arr = (T[]) new Object[currentsize];
	}
	
	public void push(Object o){
		if(size==currentsize){
			
		}
		arr[position++] = (T) o;
	}
	    
	public Object pop(){
	    if (position == 0){
	    	throw new EmptyStackException();
	    }
	    return arr[--position];
	}
	
	private class MyIterator implements Iterator<T>{

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public MyIterator(){
			
		}
		
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
