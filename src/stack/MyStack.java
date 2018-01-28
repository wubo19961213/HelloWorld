package stack;

import java.util.LinkedList;

import Interface.Stack;
import charactor.Hero;

public class MyStack implements Stack {
	LinkedList<Hero> heros = new LinkedList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack myStack = new MyStack();
		///LinkedList<Hero> heros = new LinkedList();
		myStack.push(new Hero("q"));
		myStack.push(new Hero("w"));
		myStack.push(new Hero("e"));
		myStack.push(new Hero("r"));
		System.out.println(myStack.peek());
		System.out.println(myStack.pull());
	}

	@Override
	public void push(Hero h) {
		// TODO Auto-generated method stub
		heros.addLast(h);
	}

	@Override
	public Hero pull() {
		// TODO Auto-generated method stub
		return heros.removeLast();
	}

	@Override
	public Hero peek() {
		// TODO Auto-generated method stub
		return heros.getLast();
	}

}
