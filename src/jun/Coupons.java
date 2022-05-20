package jun;

public class Coupons {
	int couponId, disVal;
	int price;
	static int aftCouPrice;
	public int getCouponId() {
		return couponId;
	}
	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}
	public int getDisVal() {
		return disVal;
	}
	public void setDisVal(int disVal) {
		this.disVal = disVal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAftCouPrice() {
		return aftCouPrice;
	}
	public void setAftCouPrice(int aftCouPrice) {
		this.aftCouPrice = aftCouPrice;
	}
	public static int applyCoupon(int price, int disVal) {
//		this.price = price;
//		this.disVal = disVal;'
		int disPrice;
		
		try {
			disPrice = price * disVal /100;
			if(disPrice < 120) {
			aftCouPrice = price - (price * disVal / 100);
			}
			else {
				aftCouPrice = price - 120;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aftCouPrice;
	}
	/*
	 *1000
	 *10
	 *900 
	 */
}
