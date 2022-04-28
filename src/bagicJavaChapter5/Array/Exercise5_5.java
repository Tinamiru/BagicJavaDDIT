package bagicJavaChapter5.Array;

import java.util.Random;

public class Exercise5_5 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];

		for (int i = 0; i < ballArr.length; i++) {
			int j = random.nextInt(9);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}

		for (int i = 0; i < ball3.length; i++) {
			ball3[i] = ballArr[i];
		}

		for (int i = 0; i < ball3.length; i++) {
			System.out.println(ball3[i]);
		}
	}
}
