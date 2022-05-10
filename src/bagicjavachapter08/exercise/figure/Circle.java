package bagicjavachapter08.exercise.figure;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		double result = 2 * Math.PI * radius;
		return result;
	}

	@Override
	public double area() {
		double result = Math.PI * radius;
		return result;
	}

	@Override
	public String toString() {
		return "도형의 종류: 원, 둘레: " + perimeter() + "cm, 넓이: " + area() + "㎠";
	}

}
