package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import jun.Coupons;

public class CouponTest {

	@Test
	public void test() {
		assertEquals(900, Coupons.applyCoupon(1000,10));
		assertEquals(2880, Coupons.applyCoupon(3000,10));
		assertEquals(1080, Coupons.applyCoupon(1200,10));
	}

}
