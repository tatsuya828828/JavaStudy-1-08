import job.Hero;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Hero hero = new Hero("太郎");
		Hero.attack(hero);
		Hero.attack(hero);
		Hero.slip(hero);
		Hero.sleep(hero);
		Hero.slip(hero);
		Hero.slip(hero);
		Hero.sit(hero, 1);
		Hero.run(hero);
	}
}
