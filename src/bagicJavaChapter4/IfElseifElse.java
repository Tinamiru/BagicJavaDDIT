package bagicJavaChapter4;

public class IfElseifElse {
	public static void main(String[] args) {

		int score = 85;
		if (score>90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B입니다.");

		} else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 입니다.");
			
		}else {
			System.out.println("점수가 70이하 입니다.");
			System.out.println("등급은 D입니다.");
			
		}

	}
}
