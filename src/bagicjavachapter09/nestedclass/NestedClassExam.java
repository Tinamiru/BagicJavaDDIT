package bagicjavachapter09.nestedclass;

import bagicjavachapter09.nestedclass.OuterClass.InnerClass;

public class NestedClassExam {
	public static void main(String[] args) {

		OuterClass outerClass = new OuterClass();
		InnerClass innerClass = outerClass.new InnerClass();

//		InnerClass innerClass = new OuterClass().new InnerClass();

//		// static의 경우
//		InnerClass innerClass = new InnerClass();
//
//		new OuterClass.InnerClass();
		
//		OuterClass outerClass = new OuterClass();
		

	}
}
