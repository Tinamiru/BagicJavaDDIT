package bagicJavaChapter6.Class;

public class MemberExam {
	public static void main(String[] args) {
		Member2 member1 = new Member2();
		member1.name = "최하얀";
		member1.age = 23;

		Member2 member2 = new Member2();
		member2.name = "홍길동";
		member2.age = 27;
		
		Member2 memberAgrs = new Member2();
		memberAgrs.member("Jr", 28);
		
		System.out.println(member1.name);
		System.out.println(member1.age);
		
		System.out.println(member2.name);
		System.out.println(member2.age);

		System.out.println(memberAgrs.name);
		System.out.println(memberAgrs.age);
		
		System.out.println(member1); // 주솟값 출력
		System.out.println(member2); // 주솟값 출력
		System.out.println(memberAgrs); // 주솟값 출력
	}
}
