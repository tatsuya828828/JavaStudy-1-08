package job;
import java.util.Random;

public class Hero {
	private String name;
	private int maxHp;
	private int hp;
	private int power;
	// finalを宣言することで定数フィールドになる
	final private int level = 5;

	public Hero() {
		this("たかし");
	}
	public Hero(String name) {
		this.name = name;
		this.maxHp = 100+this.level*2;
		this.hp = this.maxHp;
		this.power = new Random().nextInt(10)+10+this.level;
	}

	public static void attack(Hero hero) {
		System.out.println(hero.name +"は"+ hero.power +"のダメージを与えた！");
	}

	public static void sleep(Hero hero) {
		int heal = hero.maxHp - hero.hp;
		System.out.println(hero.name +"は、眠ってHPを"+ heal +"回復した");
		hero.hp = hero.maxHp;
		System.out.println(hero.hp +"/"+ hero.maxHp);
	}

	public static void sit(Hero hero,int sec) throws InterruptedException {
		System.out.println(hero.name +"は、"+ sec +"秒座った");
		int sitSec = sec*1000;
		Thread.sleep(sitSec);
		hero.hp += sec+5;
		System.out.println("HPが"+ (sec+5) +"回復した");
		System.out.println(hero.hp +"/"+ hero.maxHp);
	}

	public static void slip(Hero hero) {
		int damage = new Random().nextInt(5)+1;
		System.out.println(hero.name +"は、転んで"+ damage +"のダメージを受けた");
		hero.hp -= damage;
		System.out.println(hero.hp +"/"+ hero.maxHp);
	}

	public static void run(Hero hero) {
		System.out.println(hero.name +"は逃げ出した");
	}
}
