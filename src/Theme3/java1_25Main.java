/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package Theme3;

import java.util.Scanner;

import Theme3_sub.java1_25_2Sub;


public class java1_25Main {

	public static void main(String[] args) {

		// 標準入力を指定
		Scanner scanner = new Scanner(System.in); // 修正

		System.out.print("名前を入力してください: "); // 修正

		// 1行を読み込んで返却
		String name = scanner.nextLine(); // 修正

		// インスタンス化
		java1_25_2Sub status = new java1_25_2Sub();

		// 値代入	
		status.setName(name); // 修正
		status.setHp((int) (Math.random() * 1000) + 1);
		status.setMp((int) (Math.random() * 1000) + 1);
		status.setAttack((int) (Math.random() * 1000) + 1);
		status.setAgility((int) (Math.random() * 1000) + 1);
		status.setDefense((int) (Math.random() * 1000) + 1);

		// 出力
		System.out.println(status);

		scanner.close();
	}
} // 修正