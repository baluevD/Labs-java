package ru.spbstu.telematics.Baluev.lab02;

public class Main {
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.size());
		System.out.println();
		
		for (Integer t: stack){
			System.out.print(t + " ");
			System.out.println();
		}
		System.out.println();
		
		stack.pop();
		stack.pop();
		
		System.out.println(stack.size());
		System.out.println();
		
		for (Integer o: stack){
			System.out.print(o + " ");
			System.out.println();
		}
		System.out.println();
	}
}
