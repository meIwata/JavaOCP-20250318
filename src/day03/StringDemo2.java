package day03;

public class StringDemo2 {

	public static void main(String[] args) {
		// StringBuffer vs StringBuilder(Java 5.0)
		// 多執行緒下(慢)         單工模式下(快)
		
		StringBuilder sb= new StringBuilder();
		sb = sb.append("17").append("!");
		// sb.append("17").append("!"); //這樣寫一樣會改寫內容
		
		System.out.println(sb);
		// System.out.println(sb.toString());//兩個是一樣的
	}

}
