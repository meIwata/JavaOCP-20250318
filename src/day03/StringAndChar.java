package day03;

public class StringAndChar {

	public static void main(String[] args) {
		// 建立char
		char c1 = 'A';
		char c2 = 'A';

		// 判斷是否相等?
		System.out.println(c1 == c2); // true (== 是用來比較stack內容)

		// 建立字串
		String s1 = new String("Java");
		String s2 = new String("Java");
		System.out.println(s1 == s2); 
		System.out.println(s1.equals(s2)); // 有分大小寫的比較
		System.out.println(s1.equalsIgnoreCase(s2)); // 不分大小寫得比較
	}
}
