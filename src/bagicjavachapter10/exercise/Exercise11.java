package bagicjavachapter10.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
//			int input = Integer.parseInt(scanner.next());
//			int input2 = Integer.parseInt(scanner.next());
			System.out.print("어떤 수를 나누시겠습니까?>>");
			int input = scanner.nextInt();
			System.out.print("어떤 수로 나누시겠습니까?>>");
			int input2 = scanner.nextInt();

			if (input2 == 0 || input == 0) {
				throw new RuntimeException("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} else {
				int avg = input / input2;
				System.out.printf("%d / %d = %d", input, input2, avg);
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}