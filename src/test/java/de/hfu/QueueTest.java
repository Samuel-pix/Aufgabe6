package de.hfu;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class QueueTest {
	@Test
	public void erzeugeQueue() {
		Queue a = new Queue(3);
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		assertEquals(1,a.dequeue());
		a.enqueue(4);
		a.enqueue(5);
		assertEquals(2,a.dequeue());
		assertEquals(3,a.dequeue());
		assertEquals(5,a.dequeue());
		try{
			 a.dequeue();
			 fail("dequeue on empty queue");
			 } catch(IllegalStateException e){
			 } 
		}

	

}
