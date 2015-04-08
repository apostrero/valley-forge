package com.bluewinker.challenge.solution;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
    private MyQueue queue;
	
	@Before
	public void init() {
		queue = new MyQueue();
	}

	@Test
	public void testQueueIsEmpty() {
		assertTrue(queue.empty());
	}
	
	@Test
	public void testQueueNotEmpty() {
		queue.addBack(new Integer(10));
		assertTrue(!queue.empty());
	}
	
	@Test
	public void testQueueOneItem() {
		queue.addBack(new Integer(10));
		assertTrue(!queue.empty());
		
		Integer item = (Integer)queue.removeFront();
		assertTrue(null != item);
		assertTrue(10 == item.intValue());
	}

	@Test
	public void testQueueReturnsNullOnEmpty() {
		Object nothing = queue.removeFront();
		assertNull(nothing);
	}
	
	@Test
	public void testQueueOrdering() {
		queue.addBack(new Integer(10));
		queue.addBack(new Integer(20));
		queue.addBack(new Integer(30));
		queue.addBack(new Integer(40));
		queue.addBack(new Integer(50));
		
		Integer item = (Integer)queue.removeFront();
		assertEquals(10, item.intValue());

		item = (Integer)queue.removeFront();
		assertEquals(20, item.intValue());
		
		item = (Integer)queue.removeFront();
		assertEquals(30, item.intValue());

		item = (Integer)queue.removeFront();
		assertEquals(40, item.intValue());

		item = (Integer)queue.removeFront();
		assertEquals(50, item.intValue());
}
}
