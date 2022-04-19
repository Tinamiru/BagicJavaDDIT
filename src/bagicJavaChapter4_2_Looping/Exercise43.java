package bagicJavaChapter4_2_Looping;

import java.util.Scanner;

public class Exercise43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");

		System.out.print("프로그래밍 기초: ");
		int baseProg = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int dataBase = scanner.nextInt();
		System.out.print("화면 구현: ");
		int view = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int app = scanner.nextInt();
		System.out.print("머신러닝: ");
		int machineLean = scanner.nextInt();

		int total = baseProg + dataBase + view + app + machineLean;
		double avg = total / 5;
		String grades = "";

		// IF문을 활용한 풀이방법
//		if (avg >= 90) {
//			grades = "A";
//		} else if (avg < 90 && avg >= 80) {
//			grades = "B";
//		} else if (avg < 80 && avg >= 70) {
//			grades = "C";
//		} else if (avg < 70 && avg >= 60) {
//			grades = "D";
//		} else {
//			grades = "F";
//		}
		
		// 스위치문을 활용한 풀이방법
		int kay = (int) (avg * 0.1);
		System.out.println(kay);
		switch (kay) {
		case 6:
			grades = "D";
			break;
		case 7:
			grades = "C";
			break;
		case 8:
			grades = "B";
			break;
		case 9: case 10:
			grades = "A";
			break;
		default:
			grades = "F";
			break;
		}

		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		System.out.println("학점: " + grades);
	}
}
