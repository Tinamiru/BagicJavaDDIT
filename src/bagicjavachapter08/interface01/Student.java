package bagicjavachapter08.interface01;

public class Student implements Comparable<Student> {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// 문자열의 경우 조건문을 사용하지 않아도
		// 양수,음수,0의 값으로 반환되기 때문에 바로 리턴하여 줄 수 있다.
		
		//문자열을 정렬할 경우.
		
		//return this.name.compareTo(o.name); 

		//이때 오름차순으로 정렬할 경우 리턴값 앞에
		// 음수(-)를 기입하면 reverse.
		
		//return -this.name.compareTo(o.name); 
		
		// 숫자를 정렬할 경우
		if (this.age > o.age) {
			return 1;
		} else if (this.age < o.age) {
			return -1;
		} else {
			return 0;
		}
		
		// 오름차순의 경우 부호를 반대로 지정하면
		// 반대의 값으로 리턴하여 오름차순으로 출력된다.
	}

}