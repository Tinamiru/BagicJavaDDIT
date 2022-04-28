package bagicJavaChapter5.PrimitiveType;

import java.util.Scanner;

public class StringExam {
	public static void main(String[] args) {
		// String Pool - 힙 내에 존재하며 스트링들이 들어가있는 공간
		Scanner scanner = new Scanner(System.in);
		String next1 = scanner.next();
		String next2 = scanner.next();
		System.out.println(next1.equals(next2));
		System.out.println(next1 == next2);

		String name1 = "홍길동"; // 같은문자가 나올경우 같은 주소가 나오게끔 내부에서 조정한다.
		String name2 = "홍길동";
		String name3 = new String("홍길동"); // 원칙적으로 문법상 이것이 맞으나 자바 내에서 스트링을 많이 사용하기떄문에 기본타입처럼 허용해준다.
		String name4 = new String("홍길동");

		System.out.println(name1.equals(name2));
		System.out.println(name1 == name2);

		System.out.println(name3.equals(name4));
		System.out.println(name3 == name4);
	}
}
