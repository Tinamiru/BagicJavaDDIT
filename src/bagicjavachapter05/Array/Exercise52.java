package bagicjavachapter05.Array;

import java.util.Arrays;
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		// 로또번호 생성
		Random random = new Random();
		int array[] = new int[6];

		for (int i = 0; i < array.length; i++) {
			int ran = random.nextInt(45) + 1;
			array[i] = ran;
			for (int j = 0; j < array.length; j++) {
				if (array[j] == array[i]) {
					array[j] = random.nextInt(45) + 1;
				}
			}
		}System.out.println(Arrays.toString(array));
	}
}
