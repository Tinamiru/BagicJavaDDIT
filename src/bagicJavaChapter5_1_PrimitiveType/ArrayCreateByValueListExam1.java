package bagicJavaChapter5_1_PrimitiveType;

public class ArrayCreateByValueListExam1 {
	public static void main(String[] args) {
		// 배열의 단점
		// 1. 타입의 일치.
		// 2. 한번 배열을 설정할때 갯수를 수정 할 수 없다.

		int[] scores = { 83, 90, 87 };

		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합: " + sum);
		double avg = (double) sum / 3;
		System.out.println("평균: " + avg);

	}
}
