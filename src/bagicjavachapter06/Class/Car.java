package bagicjavachapter06.Class;

public class Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	Car() {
	}

	Car(String model) {
		this.model = model; // this = 필드지정. 생성자 첫줄에만 기술가능.
	}

	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
