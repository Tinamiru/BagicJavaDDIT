package bagicJavaChapter6.ClassExam;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time() {
		this(00, 00, 00);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toString() {

		String result = String.format("%02d:%02d:%02d", hour, minute, second);
		return result;

	}
}
