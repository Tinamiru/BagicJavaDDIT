package bagicJavaChapter6.Singleton;

public class Singleton {
	private static Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

	private String name;
	private int age;

	private Singleton() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
