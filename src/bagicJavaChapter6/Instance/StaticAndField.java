package bagicJavaChapter6.Instance;

public class StaticAndField {
	int gas;
	
//	static int gas() {
//		return gas;
//	}
	static int gas() {
		StaticAndField cal1 = new StaticAndField();
		return cal1.gas;
	}
	
	
}
