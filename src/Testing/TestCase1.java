/**
 * 
 */
package Testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jun.Coupons;

/**
 * @author pongi
 *
 */
public class TestCase1 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	

	@Test
	public void test1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		assertEquals(900, Coupons.applyCoupon(1000,10));
		assertEquals(2880, Coupons.applyCoupon(3000,10));
		assertEquals(1080, Coupons.applyCoupon(1200,10));
	}
	
	
	@Test
	public void test3() {
		assertEquals(900, Coupons.applyCoupon(1000,10));
		assertEquals(2880, Coupons.applyCoupon(3000,10));
		assertEquals(1080, Coupons.applyCoupon(1200,10));
	}
	

}
