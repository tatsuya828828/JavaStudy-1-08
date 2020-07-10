import java.util.Scanner;

import job.Hero;
import monster.Matango;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("名前を入力してください:");
		String name = new Scanner(System.in).nextLine();
		Hero hero = new Hero(name);
		System.out.println(hero.getName() +"を生み出しました");
		System.out.println(hero.getName() +"は旅に出た");
		Matango matango = new Matango();
	}
}
