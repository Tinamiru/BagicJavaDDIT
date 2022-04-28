package bagicJavaChapter4.IfAndSwitch;

import java.util.Random;

public class RandomExam {
public static void main(String[] args) {
	// 옛날 랜덤 공식	마지막숫자 	-  처음숫자 + 1 ------- 해킹위험이 있음.
//	(int)(Math.random()*(추출할숫자)) + 처음숫자;

	
	//	random.nextInt(80); //0부터 5까지 시큐어랜덤이라는 더 보안이좋은 랜덤이 있다.
	
	Random random = new Random();
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
	System.out.println(random.nextInt(6));
}
}
