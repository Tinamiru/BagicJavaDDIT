package bagicjavachapter08.interface01.exercise;

public interface Sort {
	void ascending(int[] array);

	void descending(int[] array);

	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	};
}
