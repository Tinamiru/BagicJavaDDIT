package bagicjavachapter08.exercise.book;

public class ScienceFiction extends Book {


	public ScienceFiction(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		int result = 600 * lateDays;
		return result;

	}

}
