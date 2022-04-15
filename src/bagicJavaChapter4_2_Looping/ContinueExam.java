package bagicJavaChapter4_2_Looping;

public class ContinueExam {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i%2 != 0) {
				continue;
			}System.out.println(i);
		}
	}
}
