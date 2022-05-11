package bagicjavachapter10.exceptionclass;

public class ThrowsExam {
	public static void main(String[] args) {
		// throw 명령어
		try {
			throw new RuntimeException("내가 만든 에러");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

	}
}
