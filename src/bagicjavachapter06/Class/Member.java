package bagicjavachapter06.Class;

public class Member {
	String name;
	int age;
	String nation;
	int ssn;
	// 생성자와 메소드는 다르다.
	
	public Member() { // 생성자에도 접근제한자가 기입되나, 생략하면 default 값.
		this(null, 0, null, 0);
	}

	public Member(String name) {
		this(name, 0, null, 0);
	}

	public Member(String name, int age) {
		this(name, age, null, 0);
	}

	public Member(String name, int age, String nation) {
		this(name, age, nation, 0);
	}

	public Member(String name, int age, String nation, int ssn) {
		this.name = name;
		this.age = age;
		this.nation = nation;
		this.ssn = ssn;
	}

}
