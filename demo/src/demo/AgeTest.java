package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {

	Age a;
	@Before
	public void init()
	{
		a=new Age();
	}
	@Test
	public void test() {
		
		assertEquals("eligible",a.Election(26));
		}
	@Test
	public void test1() {
		
		assertEquals("not eligible",a.Election(12));
		}

}
