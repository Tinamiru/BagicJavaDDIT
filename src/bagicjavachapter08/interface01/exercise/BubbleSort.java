package bagicjavachapter08.interface01.exercise;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] array) {
		System.out.println("BubleSort asc");
	}

	@Override
	public void descending(int[] array) {
		System.out.println("BubleSort desc");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("버블정렬입니다.");
	}

}
