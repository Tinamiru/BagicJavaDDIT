package todayLunch;

import java.util.Random;

public class FoodList {

	public void listRandom() {
		FoodDB foodDB = new FoodDB();
		Random random = new Random();
		int ranNum = random.nextInt(47)+1;
		System.out.print(random + ". ");
		foodDB.printName(ranNum);
	}

}