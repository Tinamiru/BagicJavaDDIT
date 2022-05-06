package bagicjavachapter08.interface01.exercise;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] array) {
		System.out.println("QuickSort asc");
	}

	@Override
	public void descending(int[] array) {
		System.out.println("QuickSort desc");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("퀵정렬입니다.");
	}

}
