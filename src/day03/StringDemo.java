package day03;

public class StringDemo {

	public static void main(String[] args) {
		// 字串 concat的應用
		String s1 = "Java";
		s1 = s1.concat("8");
		System.out.println(s1);
		
		
		String s2 = "Java";
		s2.concat("11"); // 並沒有把值賦予給s2
		System.out.println(s2);
		
		
		// 字串replace的應用
		String s3 = "Java";
		s3 = s3.replace('J', 'A'); //把J替換成A，並賦予到s3
		System.out.println(s3);
	}

}
