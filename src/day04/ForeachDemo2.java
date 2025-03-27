package day04;

public class ForeachDemo2 {

	public static void main(String[] args) {
		int[][] scores = { { 100, 90 }, { 80, 70 }, { 60, 50 } };
		
		//傳統for迴圈
		for(int i = 0;i<scores.length;i++) {
			for(int j=0;j<scores[i].length;j++) {
				System.out.println(scores[i][j]);
			}
		}
		
		System.out.println("--------------------------");
		
		// 利用 for each 印出每一個成績
		for(int[]row:scores) { //先拆第一個陣列
			for(int score:row) { 
				System.out.println(score);
			}
		}
		
		System.out.println("===========================");
		int[][][] scores2 = {
								{{100,90}, {80,70}},
								{{60,50}, {40,30}},
								{{20, 10}, {5,1}}
							};
		
		System.out.println("--------------------------");
		
		// 遍歷三維陣列
        for (int i = 0; i < scores2.length; i++) { // 外層迴圈：遍歷最外層的陣列
            for (int j = 0; j < scores2[i].length; j++) { // 中層迴圈：遍歷每一個二維陣列
                for (int k = 0; k < scores2[i][j].length; k++) { // 內層迴圈：遍歷每一個一維陣列
                    System.out.println(scores2[i][j][k]); // 印出每一個分數
                }
            }
        }
		
        System.out.println("--------------------------");
		
		for(int[][] row2:scores2) {
			for(int[]row: row2) {
				for(int score: row) {
					System.out.println(score);
				}
			}
		}
		
	}
}
