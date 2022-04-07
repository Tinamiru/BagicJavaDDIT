package bagicJavaChapter2;

public class VarExam {

	public static void main(String[] args) {

		// 2. 변수

		byte age = 10; // 변수의 선언 및 초기화
		String name = "홍길동";

		byte a;
		a = 10;
		int b; // 변수 선언.
		b = 100; // 변수의 초기화.

		System.out.println(age);
		System.out.println(b);

//		변수명은 대소문자를 구분한다.
//		변수명을 지정할때 명명규칙을 따라야 한다. 이것을 naming convention 이라고한다.;
//		특징으로는 대소문자에 대한 관례 Ex. peopleName
//		그리고 필수로 변수명은 문자로 시작해야하는것.

//		자바언어는 언더바(_)를 붙이지 않는 것이 관례이다
//		보통 C언어를 먼저 배울경우 언더바를 붙이는 경우가 있으나
//		대소문자의 관례로 단어구분을 하여준다.

//		로직은 가독성이 너무나도 중요하며 프로젝트를 여러사람이 공유할경우 서로 이해하기 쉽게 로직을 짜는것이 핵심이다.

		/*
		 * int value;
		 * 
		 * int result = value + 2;
		 * 
		 * System.out.println(result);
		 */

		int value = 0;

		int result = value + 2;

		System.out.println(result);

//		변수의 초기화가 왜 중요한가.
//		초기화가 되어지지 않으면(데이터타입에 대한 변수의 결과값을 지정하지 않는것)
//		컴파일 에러가 난다.

		int hour = 3;
		int minute = 5;

//		변수의 연산
		
		System.out.println(hour + "시간 " + minute + "분");

		int totalMinute = (hour * 60) + minute;

		System.out.println("총 " + totalMinute + "분");
		System.out.println("총 " + totalMinute + "분");
		
		

	}

}
