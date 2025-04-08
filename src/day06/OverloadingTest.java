package day06;

public class OverloadingTest {
	// 類別方法
//	public static void run(int x) {
//		System.out.println("A");
//	}

//	public static void run(long x) {
//		System.out.println("B");
//	}

	public static void run(float x) {
		System.out.println("C");
	}
	
//	public static void run(double x) {
//		System.out.println("D");
//	}
	public static void run(Integer x) {
		System.out.println("E");
	}
	

	public static void main(String[] args) {
//		run(100); // A
//		run(100L); // B
//		run(3.14); // D
//		run(3.14f); // C
		
//------------------------------
//		run(100); //B
//		run(100); // C
		run(100);  // 會先找基本資料型別
	}

}
