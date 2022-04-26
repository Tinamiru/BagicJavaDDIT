package bagicJavaChapter5_2_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise52_2 {
	public static void main(String[] args) {
		// 로또번호 생성
		Integer[] array = new Integer[45];
		List<Integer> list = Arrays.asList(array);
		for (int i = 0; i < array.length; i++) {
			array[i]= i+1;
		}
		Collections.shuffle(list);
		list.toArray(array);

		for (int i = 0; i < 6; i++) {
			System.out.println(array[i]);
		}
	}
}
