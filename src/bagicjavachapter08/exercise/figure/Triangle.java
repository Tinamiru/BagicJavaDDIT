package bagicjavachapter08.exercise.figure;

public class Triangle extends Shape {
	private double side;

	public Triangle(double side) {
		super();
		this.side = side;
	}

	@Override
	public double perimeter() {
		double result = 3 * side;
		return result;
	}

	@Override
	public double area() {
		double result = side * (Math.sqrt(3) / 2 * side) / 2.0;
		return result;
	}

	@Override
	public String toString() {
		return "도형의 종류: 삼각형, 둘레: " + perimeter() + "cm, 넓이: " + area() + "㎠";
	}
}
