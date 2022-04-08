package bagicJavaChapter2;


	import java.util.Scanner;

	class num {

		public num(int init) {
			if (init == 49) {
				init = 1;
			} else if (init == 48) {
				init = 0;
			}
			System.out.println(init);
		}
	}

	public class Baekjun1373 {
//		2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
//		첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
//		첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
//		입력
//		11001100


		// -미완성-
		// 뒤집기와 거듭제곱을 구했으나 뒤집은 자릿수의 값이 int값으로 인식이 안되며 캐스팅에 경우에 1은 49, 0은 48로 나오게됨.
		// 0과 1을 정해주고 아래의 거듭제곱의 값과 곱해준 다음 합을 구하면 10진법으로 변환완료.
		// 10진법을 8진법으로 다시 변환해주는 공식 만들어야함.




		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			String input = sc.nextLine();

			int numLength = input.length();

			String revResult = "";
			int tenChen = 0;
			int pow = 2; // 2진수
			int rev = 0;

			for (int i = input.length() - 1; i >= 0; i--) { // 여기 뭔가 이상함.
				revResult += input.charAt(i);
			}
			
			System.out.println("\n뒤집은 결과 : " + revResult);
			int valuePI = Integer.parseInt(revResult);
			System.out.println("숫자로 변환 : " + valuePI); // 숫자로 변환.
			System.out.println("자릿수 : " + numLength + "\n");

			for (int j = 0; j < numLength; j++) {// pow 값을 도출성공.
				if (revResult.charAt(j) != 1) {
//					rev = revResult.charAt(j);
//					num(rev);
					System.out.println((j + 1) + "자리수의 2의 제곱 : " + pow); // 살리기
					pow = pow * 2; // 살리기
				}

			}
//				tenResult = revResult.charAt(j) * (pow); // revResult.charAt(j)는 밑 pow는 거듭제곱 (2^n)
//			}
			sc.close();
			
		}

	}