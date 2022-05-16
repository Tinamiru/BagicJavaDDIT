package baekjoon;

import java.util.Scanner;

public class BaekJoon1373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputNum = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		int inputLeng = inputNum.length();
		
			if (inputLeng % 3 == 1) {
				sb.append(inputNum.charAt(0)-'0');
			} else if (inputLeng % 3 == 2){
				sb.append((inputNum.charAt(0) - '0') * 2 + (inputNum.charAt(1) - '0'));
			}
			
			for(int i = inputLeng % 3; i < inputLeng; i += 3) {
				sb.append((inputNum.charAt(i) - '0') * 4 + (inputNum.charAt(i + 1) - '0') * 2 + (inputNum.charAt(i + 2) - '0'));
			}
			
		System.out.println(sb);

	}
}
