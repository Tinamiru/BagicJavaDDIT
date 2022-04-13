package bagicJavaChapter3;

public class BagicOfJavaExam {

	public static void main(String[] args) {
//		아래의 코드는 사과를 담는데 필요한 바구니(버킷)의 수를 구하는 코드이다.
//		만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
//		13개의 바구니가 필요할 것이다. (1)에 들어갈 알맞은 코드를 입력하시오.
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples / sizeOfBucket + 1);
		System.out.println("필요한 바구니의 수 : " + numOfBucket);

//		아래는 변수 num의 값에 따라 "양수", "음수", "0"을 출력하는 코드이다.
//		삼항 연산자를 이용해서 (1)에 들어갈 알맞은 코드를 입력하시오.
		int num = 10;
		System.out.println((num == 0) ? "0" : ((num > 0) ? "양수" : "음수"));

//		아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다.
//		만일 변수 num의 값이 456이라면 400이 되고, 111이라면 100이 된다.
//		(1)에 들어갈 알맞은 코드를 입력하시오.
		int num2 = 456;
		System.out.println(num2/100*100);

//		아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서
//		변수 num의 값을 뺀 나머지를 구하는 코드이다.
//		예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이다.
//		19의 경우 20이고, 81의 경우 90이 된다.
//		30에서 24를 뺀 나머지는 6이기 때문에 변수 num의 값이 24라면 을 결과로 얻어야 한다.
//		(1)에 들어갈 알맞은 코드를 입력하시오.
		int num3 = 24;
		System.out.println(((((num3/10)+1)*10)-num3));

//		다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나
//		숫자일 때만 변수 b값이 true가 되도록 하는 코드이다.
//		(1)에 들어갈 알맞은 코드를 입력하시오.
		char ch = 'z';
		boolean b = (48<=ch && 57>=ch)||(65<=ch && 90>=ch)||(97<=ch && 122>=ch);
		System.out.println(b);

//		다음은 대문자를 소문자로 변경하는 코드인데,
//		문자 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경한다.
//		문자코드는 소문자가 대문자보다 32만큼 더 크다.
//		예를 들어 'A'의 코드는 65이고, 'a'의 코드는 97이다.
//		(1) ~ (2)에 들어갈 알맞은 코드를 입력하시오.

		char ch2 = 'A';
		char lowerCase = (ch2 <= 90 && ch2 >= 65) ? (char)(ch2 + 32) : ch2;
		System.out.println("ch: " + ch2);
		System.out.println("ch to lowerCase: " + lowerCase);
	}

}
