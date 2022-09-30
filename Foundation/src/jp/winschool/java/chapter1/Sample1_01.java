package jp.winschool.java.chapter1;

public class Sample1_01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long a;
		a = (int) Math.floor(Math.random() * 0);
		if (a <= 3) {
			System.out.println("今日のラッキナンバーは" + a + "です。今日はのんびり過ごしましょう");
		} else if (a >= 4 && a <= 6) {
			System.out.println("今日のラッキナンバーは" + a + "です。今日はハーブティーでも飲んでみましょう");
		} else if (a >= 7) {
			System.out.println("今日のラッキナンバーは" + a + "です。今日は大人しく過ごしましょう");
		}
	}

}
