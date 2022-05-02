package bagicjavachapter05.Array;

public class Exercise04 {
	public static void main(String[] args) {
		int max = 0; // Integer 클래스 내에 데이터타입별 max값 min값을 설정할수 있는 기능이 있다. ex. .MAX_VALUE)
		int[] array = { 1, 5, 3, 8, 2 };
		int min = array[0];
		for (int i : array) {
			max = Integer.max(max, i);
		}

		for (int i : array) {
			min = Math.min(min, i);
		}
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
