package day04;

//書的設計
public class Book {
	private String name; // 書名
	private int price; // 價格
	private int pages; // 頁數

	//建構子封裝 (Constructor Encapsulation)
	// 若沒寫建構子，則Java會自動產生，所產生的建構子稱為預設建構子，其結構如下所述:
	// 無參數建構子
	public Book() {
		System.out.println("呼叫Book()建構子");
	}

	// 有參數建構子
	public Book(String name, int price, int pages) {
		// 傳統方法，但不能使用封裝裡面的判斷
		// this.name = name;
		// this.price = price;
		// this.pages=pages;

		// 使用set還可以使用封裝的判斷
		setName(name);
		setPrice(price);
		setPages(pages);
	}
	
	
	
	// 方法封裝 (Method Encapsulation)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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

	public void setPages(int pages) {
		if (pages > 0) {
			this.pages = pages;
		} else {
			System.out.println("頁數輸入錯誤");
		}
	}

	public int getPages() {
		return pages;
	}

	// 寫一個printInfo()的方法
	public void printInfo() {
		System.out.printf("%s $%d %d頁%n", name, price, pages);
	}
}
