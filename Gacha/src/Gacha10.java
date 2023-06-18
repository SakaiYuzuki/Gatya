import java.util.Scanner;

public class Gacha10 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		float number = scanner.nextFloat(); //5,6行目で何%で当たるかを設定(キーボード入力)
		System.out.println("今回のガチャ結果");
		for(int i=0; i<10; i++) {
		float r = new java.util.Random().nextFloat(100);  //0から99までの数字をランダム生成
		System.out.printf("%.1f", r); //実際に当たってるかの判定を可視化するために生成した数字を表示
			
		if(r <number) {
			System.out.println("当たり");  //0から99までの数字で生成された数字をrとし、ｒがキーボード入力したnumberより大きいsか小さいかを判定
			}
		else {
			System.out.println("はずれ");
		      scanner.close();
			}
		}
	}
}