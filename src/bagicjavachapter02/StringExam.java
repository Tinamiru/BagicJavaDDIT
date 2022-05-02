package bagicjavachapter02;

public class StringExam {

	public static void main(String[] args) {

		char c1 = 'A';
		String name = "홍길동";
		String job = "프로그래머";

//		String은 java의 기본타입이 아닌 참조타입(Reference Type)이다. (데이터타입의 색과 소문자가 아닌 대문자로 시작하는점.)

		System.out.println(name);

		System.out.println("나의 이름은 " + name + "이고, 나의 직업은 " + job + "이다.");
		System.out.println("나의 이름은 \"" + name + "\"이고, 나의 직업은 \'" + job + "\'이다.\n");

//		"을 출력하고 싶을때 문자열 내에 삽입하고싶을 경우 \(역슬래쉬)를 사용하여주면 된다. Ex. (\")
//		" 뿐만 아니라 \b  \t  \n  \f  \r  \"  \'  \\ 등이 있다. (아스키코드, 유니코드 또한 가능하다.)
//		\다음에는 문자가 아닌 특수문자가 나와야 한다. 컴파일 오류가 생긴다.

		System.out.println("나의 이름은 \"" + name + "\"이고, \n나의 직업은 \'" + job + "\'이다.");

//		실수.(float) & 형변환.

//		float과 double의 차이는 자릿수 정밀도의 차이

		// 자바의 기본값은 double에 맞춰져 있기 때문에 float은 리터럴을 float타입으로 바꾸어주는 기능을 입력해야한다.
		// 정수또한 그런데 정수는 int 타입으로 간주되어진다.

		int i = 1000000;
		long l = 10000000000000L;

		float pie1 = (float) Math.PI;
		double pie2 = Math.PI;
		System.out.println(pie1);
		System.out.println(pie2);

		// 수학 지수(exponential)
		double var6 = 3e6; // 3000000
		double var8 = 2e-3; // 0.002
		System.out.println(var6);
		System.out.println(var8);

//		논리타입.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
		boolean t = true; // 참 거짓을 담는 타입.
		boolean f = false;
	}
}