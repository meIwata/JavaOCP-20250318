package day06;

// 工具(Singleton 單例模式)
public class Util {
	// add這個方法就是 方法重載（Method Overloading）
//	public int add(int x, int y) {
//		return x + y;
//	}
//
//	public int add(int x, int y, int z) {
//		return x + y + z;
//	}
	
	// Singleton 單例: 2. 自己生成靜態物件(不給使用者new)
	private static Util util = new Util();
	
	// Singleton 單例: 3. 提供一個public static方法將util物件給使用者
	public static Util getInstance() {
		return util;
	}
	
	// Singleton 單例: 1. private建構子
	private Util() {
		
	}
	
//	public int add(int[] array) {
	public int add(int... array) { // Java 5 開始引入的 可變參數（Varargs） 語法
		int total =0;
		for(int row: array) {
			total +=row;
		}
		return total;
	}
}
