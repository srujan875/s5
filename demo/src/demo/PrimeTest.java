package demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {

	Prime p;
	@Before
	public void init()
	{
		p=new Prime();
		
	}
	
	@Test
	public void test()
	{
		assertEquals(true,p.isPrime(2));
	}
	@Test
	public void test1()
	{
		assertEquals(false,p.isPrime(4));
	}

}
