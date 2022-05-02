package bagicjavachapter03;

public class TestExam12To14 {
	public static void main(String[] args) {

		System.out.println("12번문제");
		int x = 10;
		int y = 5;
		System.out.println((x > 7) && (y <= 5));
		System.out.println((x % 3 == 27) || (y % 2 != 1));
		System.out.println();

		System.out.println("13번문제");
		int value = 0;

		value = value + 10;
		System.out.println(value);
		value = value - 10;
		System.out.println(value);
		value = value * 10;
		System.out.println(value);
		value = value / 10;
		System.out.println(value);
		// 대입연산자로 변환
		value += 10;
		System.out.println(value);
		value -= 10;
		System.out.println(value);
		value *= 10;
		System.out.println(value);
		value /= 10;
		System.out.println(value);

		System.out.println();

		System.out.println("14번문제");
		int score = 85;
		String result = (!(score > 90)) ? "가" : "나";
		System.out.println(result);
	}
}
