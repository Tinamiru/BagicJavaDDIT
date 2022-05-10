package bagicjavachapter08.exercise.book;

public class Poet extends Book {


	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int result = 200 * lateDays;
		return result;

	}

}
