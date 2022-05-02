package bagicjavachapter06.ClassExam;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car() {
	}

	public Car(String color) {
		this.color = color;
	}

	public double getSpeed() {
		if (speed < 0) {
			speed = 0;
		}
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		if ((MAX_SPEED < speed || speed <= 0)) {
			return false;
		} else {
			this.speed += speed;
			if (MAX_SPEED < this.speed) {
				this.speed -= speed;
				return false;
			}		
			return true;
		}
	}

	public static double getMaxSpeed() {
		return MAX_SPEED;
	}

	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}

}
