package bagicJavaChapter3;

public class OperationsPromotionExample {
	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteCalue3 = byteValue1+ byteValue2; --> 컴파일 에러
		int intValues1 = byteValue1 + byteValue2;
		System.out.println(intValues1);

		char charValue1 = 'A';
		char charValue2 = 2;
//		char charValue3 = charValue1 + charValue2; --> 컴파일 에러
		int intValues2 = charValue1 + charValue2;
		System.out.println("유니코드="+intValues2);
		System.out.println("출력문자="+(char)intValues2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);

		int intValue5 = 10;
//		int intValue6 = 10 / 4.5; --> 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result2 = (double) x/ y;
		System.out.println(result2);
		
	}
}
