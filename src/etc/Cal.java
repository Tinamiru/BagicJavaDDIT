package etc;

public class Cal {
	public static void main(String[] args) {

		int input = 181;
		int avr1 = input / 8;
		int per1 = input % 8;
		int avr2 = avr1 / 8;
		int per2 = avr1 % 8;
		int avr3 = avr2 / 8;
		int per3 = avr2 % 8;

		System.out.println(input + "을 8로 나눔: " + avr1);
		System.out.println("나머지: " + per1);
		System.out.println("");
		System.out.println(avr1 + "을 8로 나눔: " + avr2);
		System.out.println("나머지: " + per2);
		System.out.println("");
		System.out.println(avr2 + "을 8로 나눔: " + avr3);
		System.out.println("나머지: " + per3);

	}
}