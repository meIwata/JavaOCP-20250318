package day04;

//書的設計
public class Book {
	String name; // 書名
	private int price; // 價格
	int pages; // 頁數

	// 若沒寫建構子，則Java會自動產生，所產生的建構子稱為預設建構子，其結構如下所述:
	// 無參數建構子
	public Book() {
		System.out.println("呼叫Book()建構子");
	}

	// 封裝 Encapsulation setter
	public void setPrice(int price) { // 輸入的價格price
		if (price > 0) { // price>0
			this.price = price; // 就把 price的值賦予給price
		} else {
			System.out.println("價格輸入錯誤");
		}
	}
	// 封裝 Encapsulation getter
	public int getPrice() {
		// return this.price;
		return price;
	}

	// 寫一個printInfo()的方法
	public void printInfo() {
		System.out.printf("%s $%d %d頁%n", name, price, pages);
	}
}
