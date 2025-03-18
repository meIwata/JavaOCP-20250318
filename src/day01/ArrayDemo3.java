package day01;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// 班上有10個同學
		// 如何記錄每一個同學的成績
		int[] scores = { 80, 70, 100, 90, 40, 60, 50, 30, 95, 55 };
		// 列出每一位同學的成績
        //使用for-each/for-in(只能從前端開始印)
		for(int x:scores) {
			System.out.println(x);
		}
	}
}
