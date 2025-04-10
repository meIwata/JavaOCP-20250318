package day07;

public class ClawMachineTest {

	public static void main(String[] args) {
		// 多型
//		ClawMachine clawMachine = new ClawMachine(); // 給普通版
		ClawMachine clawMachine = new DeluxeClawMachine(); // 給豪華版

		clawMachine.insertCoin();
		clawMachine.play();
		clawMachine.play();
		if(clawMachine instanceof DeluxeClawMachine) {
			((DeluxeClawMachine)clawMachine).playMusic(); // 透過強迫轉型來呼叫playMusic()
		}
		
		System.out.println("-------------------------------------------");
		
		DeluxeClawMachine deluxeClawMachine = new DeluxeClawMachine();
		deluxeClawMachine.insertCoin();
		deluxeClawMachine.play();
		deluxeClawMachine.play();
		deluxeClawMachine.playMusic(); // DeluxeClawMachine專屬方法
	}

}
