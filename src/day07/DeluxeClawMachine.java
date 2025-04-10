package day07;

// 豪華版夾娃娃機
public class DeluxeClawMachine extends ClawMachine {
	private boolean musicEnabled = true;

	public void playMusic() {
		if (musicEnabled) {
			System.out.println("播放音樂: ♪♪♪");
		}
	}

	@Override // 覆寫父類別的方法
	public void play() {
		if (coinCount > 0) {
			coinCount--;
			playMusic(); // 撥放音樂
			System.out.println("豪華版夾娃娃機 開始夾娃娃");
		} else {
			System.out.println("請先投幣!");
		}
	}
}
