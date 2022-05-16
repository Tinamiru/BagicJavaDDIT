package bagicjavachapter11.lang;

import java.lang.reflect.Field;

import bagicjavachapter08.interface01.sortexam.Student;

public class ClassExam {
	public static void main(String[] args) {
		try {
			Class sClass = Class.forName("bagicjavachapter08.interface01.sortexam.Student");
			Class class1 = Student.class.getClass();
			Class class2 = new Student().getClass();

			System.out.println(sClass.getName());
			System.out.println(sClass.getSimpleName());
			System.out.println(sClass.isInterface());

			System.out.println("메소드 갯수: " + sClass.getMethods().length);
			System.out.println("필드 갯수: " + sClass.getFields().length);
			System.out.println("모든 필드 갯수: " + sClass.getDeclaredFields().length);

			Field[] declaredFields = sClass.getDeclaredFields();

			for (Field field : declaredFields) {
				System.out.println(field.getName());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
