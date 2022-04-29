package bagicJavaChapter6.ClassExam;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 120;

	public NewCar() {
		this("null");
	}

	public NewCar(String color) {
		this.color = color;
	}

	public double getSpeed() {;
		return mileToKillo(speed);
	}

	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (speed < 0) {
			speed = 0;
		}
		if (MAX_SPEED < speed || speed <= 0) {
			return false;
		} else {
			this.speed += speed;
			return true;
		}
	}

	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}

	private static double killoToMile(double distance) {
		distance = distance * 0.6;
		return distance;

	}

	private static double mileToKillo(double distance) {
		distance = distance / 0.6;
		return distance;

	}

	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}

}
