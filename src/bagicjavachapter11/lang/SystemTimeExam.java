package bagicjavachapter11;

public class SystemTimeExam {
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();

		long sum = 0L;
		for (long i = 1; i < 100000000000L; i++) {
			sum += i;
		}

		long time2 = System.currentTimeMillis();

		double result = (double) (time2 - time1) / 1000;
		System.out.println("계산의 합: " + (long) sum);
		System.out.println("계산에 " + result + "초가 소요되었습니다.");
	}
}
