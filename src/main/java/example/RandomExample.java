package example;

public class RandomExample {

	public static void main(String[] args) {
		//0 ～ 9までの範囲でランダムな整数を生成し
	/*	Random rnd = new Random();
		System.out.println(rnd.nextInt(10));*/

		//ランダム式の場合
		int ran;
		ran = ((int)(Math.random()*6))+1;
		System.out.println(ran);
		}
	}

