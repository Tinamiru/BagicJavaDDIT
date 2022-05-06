package bagicjavachapter08.interface01.exercise;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] array) {
		System.out.println("HeapSort asc");
	}

	@Override
	public void descending(int[] array) {
		System.out.println("HeapSort desc");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("힙정렬입니다.");
	}


}
