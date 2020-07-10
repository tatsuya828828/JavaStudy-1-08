package monster;

import java.util.Random;

public class Matango {
	private int hp = 50;
	private String name;
	// 定数フィールド名は全て大文字にする
	private final int LEVEL = 10;
	char suffix;

	public Matango() {
		int num = new Random().nextInt(3)+1;
		this.appear(num);
	}
	public Matango(char suffix) {
		this.suffix = suffix;
		this.setName("おばけきのこ"+this.suffix);
	}

	public static void run(Matango matango) {
		System.out.println(matango.getName() +"たちは逃げ出した");
	}

	public static void appear(int num){
		Matango[] matango = new Matango[num];
		for(int i=0; i<=matango.length; i++) {
			switch(i) {
				case 1:
					Matango m1 = new Matango('A');
					matango[0] = m1;
					System.out.println(matango[0].getName() +" HP:"+ matango[0].hp);
					break;
				case 2:
					Matango m2 = new Matango('B');
					matango[1] = m2;
					System.out.println(matango[1].getName() +" HP:"+ matango[1].hp);
					break;
				case 3:
					Matango m3 = new Matango('C');
					matango[2] = m3;
					System.out.println(matango[2].getName() +" HP:"+ matango[2].hp);
					break;
			}
		}
		System.out.println("が現れた！");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
