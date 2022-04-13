package bagicJavaChapter3;

import java.util.Scanner;

public class TestExam6To10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("6번문제");
		int value = 356;
		System.out.println(value / 100 * 100 + "\n");

		System.out.println("8번문제");
		int lengthTop = 5;
		int lengthBottom = 10;
		int hight = 7;
		double area = ((double) (lengthBottom + lengthTop) * hight);
		System.out.println(area + "\n");

		System.out.println("9번문제");
		System.out.print("첫번째 수: ");
		double first = scanner.nextDouble();
		System.out.print("두번째 수: ");
		double second = scanner.nextDouble();
		double numResult = first / second;
		String result = "결과:" + numResult;
		String infiny = "결과:무한대";
		String aOrB = (second > 0) ? result : infiny;
		System.out.println(aOrB + "\n");

		System.out.println("10번문제");
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2+"."+var3);
		System.out.println("원의 넓이:"+var4);
		
	}
}
