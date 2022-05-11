package bagicjavachapter08.exercise.figure;

public abstract class Shape implements Comparable<Shape> {

	abstract double area();

	abstract double perimeter();


	@Override
	public int compareTo(Shape o) {
		if (this.area() > o.area()) {
			return 1;
		} else if (this.area() < o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
// 각 하위 클래스에서 toString 메소드 내에 소수점 절삭 함수 사용.
}