package bagicjavachapter07.polymorphism;

public class DriverExam {
	public static void main(String[] args) {
//	Driver driver = new Driver();
//	Bus bus = new Bus();
//	Taxi taxi = new Taxi();

		Driver driver = new Driver();
		Vehicle vehicle = new Vehicle(); // 다형성
		Vehicle bus = new Bus();
		Vehicle taxi = new Taxi();

		driver.drive(taxi);
	}
}