package coder;

public class Main {

	public static void main(String[] args) {
		Father f = new Father();
		System.out.println(f.name);
		/*
		 * 母親のインスタンスオブジェクトはメインクラスで作成できません。
		 * 母クラスはメインクラスと同じレベルのパッケージではありませんから母親の名前を取得できない。
		 * 母親の名前を取得したいならメインに母親のクラスを受け継ぐ必要です。
		 */

	}

}
