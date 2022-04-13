package etc;

import java.util.Scanner;

public class ThreeforExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for (int i = 0; i < input; i++) {
			System.out.print(i);
			for (int j = 0; j < input; j++) {
				System.out.print(j);
				for (int k = 0; k < input; k++) {
					System.out.print(k);
				}
			}System.out.println();
		}
	}

}
