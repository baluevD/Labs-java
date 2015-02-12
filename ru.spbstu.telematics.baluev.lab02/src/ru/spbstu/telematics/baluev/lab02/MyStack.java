package ru.spbstu.telematics.Baluev.lab02;

import java.util.Iterator;

public class MyStack<T> implements IStack, Iterable<T>{
	
		private class Node<T>{
			T element;
			Node<T> next;
			
			public T getElement(){
				return element;
			}
			public Node<T> getNext(){
				return next;
			}
			
			public void setElement(T element){
				this.element=element;
			}
			public void setNext(Node<T> next){
				this.next=next;
			}	
		}
		
		private int capacity=0;
		private Node<T> top;
		private Node<T> first;
		
		public MyStack(){
			
			top=null;
			capacity=0;
		}
			
		public int size(){
			return capacity;
		}
			
		public boolean isEmpty(){
			if(top==null)
				return true;
			return false;
		}

		public void push(Object elm){
			Node<T> nod= new Node<T>() ;		
			nod.setElement((T) elm);
			nod.setNext(top);
			top=nod;
			capacity++;
			if(capacity==1){
				first=nod;
			}
		}
			
		public Object pop(){
			if(isEmpty()){
				System.out.println("Stack is empty");					
				System.exit(0);
			}
			Object obj=top.getElement();
			top=top.getNext();
			capacity--;
			return obj;
		}
		
		public Iterator<T> iterator() {
			return new MyIterator();
		}
		
		private class MyIterator implements Iterator<T>{
			Node<T> index;
			
			public MyIterator(){
				index = top;
			}

			public boolean hasNext() {
				boolean flag;
				if (flag = (index.next == top)){
					index = first;
				}
				return !flag;
			}

			public T next() {
				T elm = index.next.element;
				index = index.next;
				return elm;
			}
		}	
}