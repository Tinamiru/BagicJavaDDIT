package bagicjavachapter10.exceptionclass;

public class ExceptionExam {
	public static void main(String[] args) {
		// 1. 일반예외(Compiletime Exception)

		try {
			Class.forName("java.lang.String");
//			 2. 실행예외(Runtime Exception)

			int[] numbers = new int[5];
			numbers[10] = 100;

		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.err.println("클래스 에러 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.err.println("배열 에러 발생");

		} finally {
			System.out.println("프로그램 종료");
		}

	}
}
