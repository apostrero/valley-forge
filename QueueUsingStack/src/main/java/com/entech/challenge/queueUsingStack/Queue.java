package com.entech.challenge.queueUsingStack;

public interface Queue {

	/**
	 * Add object o to the tail of the queue.
	 */
	void addBack(Object o);

	/**
	 * Removes the object that is the head of the queue.
	 */
	Object removeFront();
}