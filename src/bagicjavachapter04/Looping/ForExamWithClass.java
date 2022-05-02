package bagicjavachapter04.Looping;

class ForExam {
	static void print1To10Exam(int parameter) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	static void sumFrom1To100Exam(int parameter) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 합: " + sum);

	}

	static void sumFrom1To100Exam2(int parameter) {
		int sum = 0;
		int i = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i - 1) + " 합: " + sum);
	}

	static void floatCounterExam(int parameter) {
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}

	static void multiplicationTableExam(int parameter) {
		for (int m = 2; m < 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
	}
}

public class ForExamWithClass {

	public static void main(String[] args) {
		ForExam fe = new ForExam();
		System.out.println("1부터 10까지의 예제");
		fe.print1To10Exam(0);
		System.out.println();
		System.out.println("1부터 100까지의 예제1");
		fe.sumFrom1To100Exam(0);
		System.out.println();
		System.out.println("1부터 100까지의 예제2");
		fe.sumFrom1To100Exam2(0);
		System.out.println();
		System.out.println("float 타입의 정확도 예제");
		fe.floatCounterExam(0);
		System.out.println();
		System.out.println("구구단 예제");
		fe.multiplicationTableExam(0);
	}
}
