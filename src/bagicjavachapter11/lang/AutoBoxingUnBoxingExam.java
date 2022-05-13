package bagicjavachapter11.lang;

public class AutoBoxingUnBoxingExam {
	public static void main(String[] args) {
		// 자동박싱
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입 시 자동 언박싱
		int value = obj;
		System.out.println("value: " + value);

		int result = obj + 100;
		System.out.println("result: " + result);

	}
}
