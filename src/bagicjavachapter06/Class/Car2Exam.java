package bagicjavachapter06.Class;

public class Car2Exam {
	public static void main(String[] args) {
		Car2 car1 = new Car2();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.speed);
		System.out.println(car1.engineStart);

		Car2 car2 = new Car2();

		car2.speed = 100;
		car2.engineStart = true;

		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.speed);
		System.out.println(car2.engineStart);

	}
}
