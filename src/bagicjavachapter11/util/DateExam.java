package bagicjavachapter11.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateExam { // SQL에 데이터를 입력 시 .util.date가 아닌 sql.date로 입력한다.
	public static void main(String[] args) {
		Date date = new Date();
		// 미국식
		System.out.println(date);
		// 형식에 맞게 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss E요일");
		String korForm = sdf.format(date);
		System.out.println(korForm);

		// 최근 (2014년 이후 JDK 1.8 이후)
		LocalDateTime now = LocalDateTime.now(); // new 를 사용할 필요가 없다.
		System.out.println(now);
		// 형식에 맞게 변환.
		String nowForm = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E요일"));
		System.out.println(nowForm);
		// 날짜만
		String nowTimeForm = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd E요일"));
		System.out.println(nowTimeForm); 
		
	}
}
