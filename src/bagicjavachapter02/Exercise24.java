package bagicjavachapter02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
//		원기둥 밑면의 반지름과 높이를 입력 받아서
//		밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자.
//		원주율은 Math.PI를 사용한다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오. (단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥 높이를 입력하시오. (단위: cm): ");
		double height = scanner.nextDouble();

		double bottom = Math.PI * Math.pow(radius, 2);
		double curvedSurface = bottom * height;

		System.out.printf("원기둥 밑변의 넓이는 " + bottom + "cm²이고, 원기둥의 부피는 " + curvedSurface + "cm² 이다.");

	}

}