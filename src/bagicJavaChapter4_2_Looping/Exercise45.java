package bagicJavaChapter4_2_Looping;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		boolean loop = true;
		int count = 1;

		while (loop) {
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int input = scanner.nextInt();
			if (input < ranNum) {
				System.out.println("정답은 더 큰 수입니다.");

			} else if (input > ranNum) {
				System.out.println("정답은 더 작은 수입니다.");
			} else {
				System.out.println("정답입니다.");
				break;
			}
			count++;
		}
		System.out.println("횟수: " + count);
		System.out.println("게임을 종료합니다.");

	}
}
