package day04;

import java.util.stream.Stream;

public class ForeachDemo {

	public static void main(String[] args) {
		String[] names = { "Bob", "Jack", "Rose", "Vincent", "Anita", "Howard", "Joanna", "Jo" };
		// 傳統for迴圈
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		System.out.println("---------------------------------");

		// 利用For each將每一個人名印出。Java 5.0 提供此語法
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("---------------------------------");
		// 利用Stream.of() 提供的foreach()方法也有異曲同工之妙。Java 8.0 提供此語法
		// 標準寫法
		Stream.of(names).forEach(name -> {
			System.out.println(name);
			}); 
		
		//精簡寫法
		Stream.of(names).forEach(name -> System.out.println(name)); 
	}
}
