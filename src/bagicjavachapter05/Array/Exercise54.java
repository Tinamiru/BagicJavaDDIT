package bagicjavachapter05.Array;

import java.util.Random;

public class Exercise54 {

	public static void main(String[] args) {
		Random random = new Random();
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;

		for (int i = 0; i < 10000; i++) {
			int ran = random.nextInt(6) + 1;
			switch (ran) {
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 5:
				five++;
				break;
			case 6:
				six++;
				break;
			}
		}
		System.out.println("------------");
		System.out.println("면\t빈도");
		System.out.println("------------");
		System.out.println("1\t" + one);
		System.out.println("2\t" + two);
		System.out.println("3\t" + three);
		System.out.println("4\t" + four);
		System.out.println("5\t" + five);
		System.out.println("6\t" + six);
	}
}
