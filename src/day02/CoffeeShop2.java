package day02;

public class CoffeeShop2 {

	public static void main(String[] args) {
		// 建立一個咖啡實體同時也設定商品資訊
		Coffee c1 = new Coffee("拿鐵", '中', 65, true);
		Coffee c2 = new Coffee("焦糖瑪奇朵", '大', 80, true);
		Coffee c3 = new Coffee("美式", '大', 50, true);
		Coffee c4 = new Coffee("摩卡", '中', 60, true);
		Coffee c5 = new Coffee("義式濃縮", '小', 55, true);
		Coffee c6 = new Coffee("巧克力脆片", '大', 120, false);

		Coffee[] coffes = { c1, c2, c3, c4, c5, c6 };

		// 印出商品資訊
		for (int i = 0; i < coffes.length; i++) {
			coffes[i].printinfo();
		}
		System.out.println("-------------------");
		// 增強型 for迴圈
		for (Coffee coffee : coffes) {
			coffee.printinfo();
		}

		System.out.println("====================");

		// cart 購物車(2杯中熱拿、3杯大熱美式、4杯大冰巧克力脆片)
		Coffee[] cart = { c1, c1, c3, c3, c3, c6, c6, c6, c6 };
		System.out.printf("買了%d 杯%n", cart.length);
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			sum = sum + cart[i].price; // 總和
		}
		
		System.out.printf("總價: $%d%n", sum);

	}

}
