package bagicjavachapter06.ClassExam;

public class Plane {
	private String manufacture; // 제작사
	private String model; // 비행기 모델명
	private int maxNumberOfpassengers; // 최대 승객 수
	private static int numberOfPlanes; // 현재까지 생성된 비행기 객체의 수.

	public Plane() {
		this(null, null, 0);
	}

	public Plane(String manufacture, String model, int maxNumberOfpassengers) {
		numberOfPlanes++;
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfpassengers = maxNumberOfpassengers;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfpassengers() {
		return maxNumberOfpassengers;
	}

	public void setMaxNumberOfpassengers(int maxNumberOfpassengers) {
		if (maxNumberOfpassengers > 0) {
			this.maxNumberOfpassengers = maxNumberOfpassengers;
		}
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return "Plane [Manufacture=" + manufacture + ", model=" + model + ", maxNumberOfpassengers="
				+ maxNumberOfpassengers + "]";
	}

}
