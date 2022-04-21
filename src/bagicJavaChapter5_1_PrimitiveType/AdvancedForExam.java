package bagicJavaChapter5_1_PrimitiveType;

public class AdvancedForExam {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		System.out.println("점수통합 = " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수평균 = " + avg);
	}
}
