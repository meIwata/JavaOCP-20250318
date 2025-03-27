package day04;

//書的設計
public class Book {
	String name; // 書名
	int price; // 價格
	int pages; // 頁數

	//若沒寫建構子，則Java會自動產生，所產生的建構子稱為預設建構子，其結構如下所述:
	//無參數建構子
	public Book() {
		System.out.println("呼叫Book()建構子");
	}
	//寫一個printInfo()的方法
	public void printInfo(){
		System.out.printf("%s $%d %d頁%n", name, price, pages);
	}
}
