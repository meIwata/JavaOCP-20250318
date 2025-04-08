package day06;

// 工具
public class Util {
	// add這個方法就是 方法重載（Method Overloading）
	public int add(int x, int y) {
		return x + y;
	}

	public int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public int add(int[] array) {
		int total =0;
		for(int row: array) {
			total +=row;
		}
		return total;
	}
}
