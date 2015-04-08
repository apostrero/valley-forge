package com.bluewinker.challenge.solution;

import com.entech.challenge.queueUsingStack.MyStack;
import com.entech.challenge.queueUsingStack.Queue;

public class MyQueue implements Queue {
	private MyStack input;
	private MyStack output;
	
	public MyQueue() {
		input = new MyStack();
		output = new MyStack();
	}

	@Override
	public void addBack(Object o) {
		input.push(o);
	}

	@Override
	public Object removeFront() {
		if (output.empty()) {
			if (input.empty()) {
				return null;
			}
			
			while (!input.empty()) {
				output.push(input.pop());
			}
		}
		
		return output.pop();
	}
	
	public boolean empty() {
		return input.empty() && output.empty();
	}
}
