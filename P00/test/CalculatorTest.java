import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CalculatorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
	}
	@Before
	public void setUp() throws Exception{
		
		
	}
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
		int actual = cal.add(a,b);
		
		int expected =5555;
		assertEquals (expected,actual);
	}
	
	@Test
	public final void testSubtract() {
		int a =9999;
		int b =1;
		Calculator cal = new Calculator();
		int actual = cal.substract(a,b);
		
		int expected =9998;
		assertEquals (expected,actual);
	}
	@Test
	public final void testMultiple() {
		int a =9;
		int b =1;
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected =9;
		assertEquals (expected,actual);
	}
	@Test
	public final void testDivide() {
		int a =6;
		int b =3;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected =2;
		assertEquals(expected,actual);
	}
	
	@After
	public void tearDown() throws Exception{
		
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}
}

