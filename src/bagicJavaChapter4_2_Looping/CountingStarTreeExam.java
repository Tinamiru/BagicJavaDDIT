package bagicJavaChapter4_2_Looping;

import java.util.Scanner;

public class CountingStarTreeExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String star = "*";

		for (int i = 1; i < num + 1; i++) {
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print(star);
			star += "**";
			System.out.println();
		}
	}
}
