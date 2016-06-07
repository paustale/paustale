package de.paustale;

import junit.framework.TestCase;

public class UtilTest extends TestCase {

	public void testMonat()  {
		assertTrue(Util.istErstesHalbjahr(2));
		assertTrue(Util.istErstesHalbjahr(6));
	}
}
