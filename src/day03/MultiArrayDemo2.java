package day03;

public class MultiArrayDemo2 {

	public static void main(String[] args) {
		// 井字遊戲
		char[][] ttt= {{'O', 'X', 'X'},{'X', 'O', ' '},{'O', ' ', ' '}};
		
		System.out.println(ttt[0]); // char 陣列就是字串
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
		
		System.out.println("------------");
		
		// 在 ttt[2][2]='O';
		ttt[2][2]='O';
		System.out.println(ttt[0]); 
		System.out.println(ttt[1]);
		System.out.println(ttt[2]);
		

	}

}
