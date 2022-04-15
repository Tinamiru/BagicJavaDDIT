package bagicJavaChapter4_2_Looping;

public class CountingStarTreeExam {
	public static void main(String[] args) {
		for (int i = 0; i < 9; i++) {
				for (int j = 8; j > i; j-=2) {
					System.out.print("1");
				}
				for (int k = 0; k <= i; k+=2) {
					System.out.print("*");
				}
			System.out.println();
		}
	}
}
