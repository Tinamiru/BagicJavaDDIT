package bagicJavaChapter6_Class;

public class CarExam {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.speed);
		System.out.println(car1.engineStart);

		Car car2 = new Car();

		car2.speed = 100;
		car2.engineStart = true;

		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.speed);
		System.out.println(car2.engineStart);

	}
}
