package de.paustale;

import junit.framework.TestCase;

public class QueueTest extends TestCase {
	

	
	public void test()  {

			Queue q = new Queue(3);
			q.enqueue(1);
			q.enqueue(2);
			q.enqueue(3);
			
			assertEquals(q.queue[0], 1);
			assertEquals(q.queue[1], 2);
			assertEquals(q.queue[2], 3);
			
			assertTrue(q.dequeue() == 1);
	}
}
