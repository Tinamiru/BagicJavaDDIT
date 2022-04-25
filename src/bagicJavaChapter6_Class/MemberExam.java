package bagicJavaChapter6_Class;

public class MemberExam {
	public static void main(String[] args) {
		Member member1 = new Member();
		member1.name = "최하얀";
		member1.age = 23;

		Member member2 = new Member();
		member2.name = "홍길동";
		member2.age = 27;
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		System.out.println(member2.name);
		System.out.println(member2.age);

		System.out.println(member1); // 주솟값 출력
		System.out.println(member2); // 주솟값 출력
	}
}
