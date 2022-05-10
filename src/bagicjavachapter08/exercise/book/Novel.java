package bagicjavachapter08.exercise.book;

public class Novel extends Book {


	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int result = 300 * lateDays;
		return result;

	}

}
