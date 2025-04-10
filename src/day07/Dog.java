package day07;

public class Dog extends Animal {
	public Dog() {
		// super(4); // 隱含呼叫父類別，不寫也會預設
		System.out.println("執行 Dog 建構子");
	}	
}
