package bagicjavachapter02;

import java.util.Scanner;

public class InputExam {

	public static void main(String[] args) {
//		4. 변수와 시스템 입출력

		Scanner scanner = new Scanner(System.in); // Quick Fix ctrl + 1
//		scanner.nextLine(); // 문자를 입력받기(엔터가 입력된 부분까지.)
//		scanner.next(); // 문자를 입력받기(공백 또는 엔터가 입력된 부분까지.)
//		scanner.nextInt(); // 정수를 입력받기
//		scanner.nextDouble(); // 실수를 입력받기

//		System.out.print("이름을 입력하세요: ");
//		String name = scanner.next();
//
//		System.out.print("나이를 입력하세요: ");
//		int age = scanner.nextInt();
//		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
//		System.out.printf("당신의 이름은 %s이고, 나이는 %d입니다.", name, age); //%를 활용한 정리방법

//		System.out.printf("잔액: %,d", 1000000);
//		System.out.printf("\n잔액: %,10d", 1000000);
//		System.out.printf("\n잔액: %.2f\n", 10.12902);
//		System.out.printf("%s-%s-%s","010","1234","5678");
		
		String name = "감자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름: "+name);
		System.out.print("나이: "+ age);
		System.out.printf("\n전화: %s-%s-%s",tel1,tel2,tel3);

	}
}
