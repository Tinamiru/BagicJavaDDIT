package bagicJavaChapter3;

public class BagicJavaChapter3 {

	public static void main(String[] args) {
//		지난시간.
//		변수: 데이터 저장
//		선언과 초기화.

//		데이터타입 이름; 선언.
//		이름 = 값; 초기화.

//		범위: 선언된 위치, 즉 중괄호 내에서 ({위치}) 자주 범하는 실수

//		Chapter 3. 타입
//		대표적 으로 많이 쓰이는 타입
//		int, 	boolean, 	double
//		정수	 논리 		실수

//		정수 = integer 약자를 많이 씀.
//		실수 = float
//		논리 = boolean

//		데이터 타입별 한정적인 양을 표현할수 있으나
//		BicInteger라는 기능으로 더 큰 수를 표현할 수 있다.
//		java math의 기능중 하나이다.
//		BicInteger는 각각의 연산식을 따로 명령으로 열어주어야 계산이 가능하다.

//		2진수.
//		0b, 0B로 시작하여 2진수를 표현할수 있음.
//		변수의 초기화 값으로 표현할 경우. 10진수로 표현된다.
//		출력의 예

		int i = 0b1011;

		System.out.println(i);

//		캐릭터. - 문자(문자열이아님)
//		캐릭터는 숫자로 표현될 수 있다.(아스키코드변환) 이때 변수의 데이터타입을 char이 아닌 int로 설정해주면된다.

		char var1 = 'A';
		int var2 = 'A';

		System.out.println(var1); // A 출력
		System.out.println(var2); // 65(아스키코드변환)

//		다른 진수들의 예시.
		char c1 = 'A'; // 직접저장
		char c2 = 65; // 10진수
		char c3 = 0x041; // 8진수
		char c4 = '\u0041'; // 16진수

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}