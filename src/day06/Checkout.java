package day06;

// 結帳
public class Checkout {
	
	//單例Singleton
	// 自己生成靜態物件(不給使用者new)
	private static Checkout checkout = new Checkout();
	
	// private建構子
	private Checkout() {
		
	}
	
	// 提供一個public static方法將 checkout 物件給使用者
	public static Checkout getInstance() {
		return checkout;
	}
	
	public void submit(int cash) {
		System.out.printf("現金:%d 結帳%n", cash);
	}
	
	public void submit(int cash, String qrcode) {
		System.out.printf("qrcode(%s) 結帳:%d %n", qrcode, cash);
	}
	
	public void submit(String cardNo, int cash) {
		System.out.printf("信用卡(%s) 結帳:%d %n", cardNo, cash);
	}
	
	public void submit() {
		System.out.printf("免結帳%n");
	}
}
