package jp.winschool.java.chapter1;

public class Sample1_02 {

	public static void main(String[] args) {
		/**
		 * 現在の天気を数値で決定。
		 * 晴れ：１、曇り：２、雨：３
		 */

		int weather = 2;

		switch (weather) {
		case 1:
			System.out.println("今日は晴れです。");
			System.out.println("いい天気なのでハイキングにでも行きましょう。");
			break;
		case 2:
			System.out.println("今日は曇りです。");
			System.out.println("映画を観に行くのはどうですか？。");
			break;
		case 3:
			System.out.println("今日は雨です。");
			System.out.println("お家でのんびりゲームでもしましょう(´∀｀)。");
			break;
		default:
			System.out.println("1か2か3を入力してください。");
			break;
		}
	}

}
