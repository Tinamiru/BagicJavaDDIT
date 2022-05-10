package bagicjavachapter09.nestedclass;

public class OuterClass {
	String outerName;
	void outerMethod() {
		System.out.println("outer method called");
		class MethodClass{
			int innerInt = 10;
		}
		MethodClass methodClass = new MethodClass();
		System.out.println(methodClass.innerInt);
	}
	class InnerClass {
		String innerName;
		void innerMethod() {
			System.out.println("inner method called");
		}
	}
}
