package bagicJavaChapter2;

public class PromotionExam {

	public static void main(String[] args) {
		long l = 50000000000L;
//		int i = l; // 컴파일 오류
		double d = l;

//		캐스팅.
		int i1 = 127;
		byte b1 = (byte) i1;

		System.out.println(b1);

//		오버플로우
		int i2 = 200;
		byte b2 = (byte) i2;

		System.out.println(b2); // 127을 넘은 수는 다시 -128로 시작해 나머지값으로 표현된다.

//		double을 int로 캐스팅 할 경우, 소수점 이하의 데이터는 표현되지 않는다.
		
		
//		정수 연산에서의 자동 타입 변환.
		byte x = 10;
		byte y = 20;
//		byte result = x+y; // 연산자가 들어가는 순간 데이터 타입은 int(기본값)으로 바뀐다.
		int result = x+y;
	}

}
