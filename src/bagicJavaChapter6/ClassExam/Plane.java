package bagicJavaChapter6.ClassExam;

public class Plane {
	private String Manufacture; // 제작사
	private String model; // 비행기 모델명
	private int maxNumberOfpassengers; // 최대 승객 수
	private static int numberOfPlanes; // 현재까지 생성된 비행기 객체의 수.

	public Plane() {
		this(null, null, 0);
	}

	public Plane(String Manufacture, String model, int maxNumberOfpassengers) {
		this.Manufacture = Manufacture;
		this.model = model;
		this.maxNumberOfpassengers = maxNumberOfpassengers;
		numberOfPlanes++;
	}

	public String getManufacture() {
		return Manufacture;
	}

	public void setManufacture(String manufacture) {
		Manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfpassengers() {
		if (maxNumberOfpassengers < 0) {
			maxNumberOfpassengers = 0;
		}
		return maxNumberOfpassengers;
	}

	public void setMaxNumberOfpassengers(int maxNumberOfpassengers) {
		this.maxNumberOfpassengers = maxNumberOfpassengers;
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return "Plane [Manufacture=" + Manufacture + ", model=" + model + ", maxNumberOfpassengers="
				+ maxNumberOfpassengers + "]";
	}

}
