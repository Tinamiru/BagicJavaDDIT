package etc;

import java.util.Scanner;

public class NumReverce {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String revInput = scanner.nextLine();
		String revresult = "";

		for (int i = revInput.length() - 1; i >= 0; i--) {
			revresult += revInput.charAt(i);
		}
		System.out.println(revresult);
	}
}