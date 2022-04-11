package bagicJavaChapter2;

import java.util.Scanner;

public class ScannerExam3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String num = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String phone = scanner.nextLine();

		
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num);
		System.out.println(phone);
//		for (int i = 0; i < 10; i++) {
//			if (i == 2 || i == 5) {
//				System.out.print(phone.charAt(i)+"-");
//			} else {
//				System.out.print(phone.charAt(i));
//			}
//		}
	}

}
