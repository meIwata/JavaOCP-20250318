package day03;

public class StringAndChar {

	public static void main(String[] args) {
		// 建立char
		char c1 = 'A';
		char c2 = 'A';

		// 判斷是否相等?
		System.out.println(c1 == c2); // true (== 是用來比較stack內容)

		// 建立字串 1
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); // 有分大小寫的比較
		System.out.println(s1.equalsIgnoreCase(s2)); // 不分大小寫得比較

		System.out.println("------------------------------");

		// 建立字串 2，String Pool機制
		String s3 = "Java"; // 字面值宣告 (字串內容可以共用)
		String s4 = "Java"; // 字面值宣告 (字串內容可以共用)
		System.out.println(s3 == s4); // true(共用)
		System.out.println(s3.equals(s4));

		// 總結: 在實務上不應用 == 來比較字串而是用equals()來進行比較
	}
}
