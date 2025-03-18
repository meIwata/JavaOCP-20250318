package day01;

import java.util.Arrays;

public class ArrayDemo4 {

	public static void main(String[] args) {
		// 班上有10個同學
		// 如何記錄每一個同學的成績
		int[] scores = { 80, 70, 100, 90, 40, 60, 50, 30, 95, 55 };
		// 列出每一位同學的成績(最簡單方式)
		System.out.println(scores); //記憶體位置
		System.out.println(Arrays.toString(scores)); //使用Arrays.toString方式
		
		//變更60分為65
		scores[5]=65;
		System.out.println(Arrays.toString(scores));
	}
}
