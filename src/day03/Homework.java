package day03;

public class Homework {

	public static void main(String[] args) {
		double[][] values = { { 170.0, 60.5 }, { 182.5, 72.5 }, { 160.0, 45.5 }, { 175.0, 75.0 } };
		// 請求平均身高與體重
		double sumh = 0;
		double sumw = 0;
		for (int i = 0; i < values.length; i++) {
			double h = values[i][0]; // 取得第i個人的身高
			sumh += h;
			double w = values[i][1]; // 取得第i個人的體重
			sumw += w;
		}

		// 增強型 for 迴圈
		// for (double[] person : values) { // 使用增強型for迴圈
		// double h = person[0]; // 取得每個人的身高
		// sumh += h;
		// double w = person[1]; // 取得每個人的體重
		// sumw += w;
		// }

		// System.out.println("平均身高: " + (sumh / values.length));
		// System.out.println("平均體重: " + (sumw / values.length));
		System.out.printf("平均身高: %.2f%n", (sumh / values.length)); // 使用printf取到小數後兩位
		System.out.printf("平均體重: %.2f%n", (sumw / values.length)); // 使用printf取到小數後兩位
	}
}
