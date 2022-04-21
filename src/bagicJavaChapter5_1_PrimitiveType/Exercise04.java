package bagicJavaChapter5_1_PrimitiveType;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i : array) {
			max = Integer.max(max, i);
		}
		System.out.println("max: " + max);
	}
}
