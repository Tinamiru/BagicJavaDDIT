package bagicjavachapter02;

public class Exercise22 {

	public static void main(String[] args) {
		double distance = 40 * (Math.pow(10,12)); // 거듭제곱 공식 Math.pow(밑, 지수)
		System.out.println(distance + "Km - 프록시마 센타우리까지의 거리.");
		
		double lightSpeed = 3 * (Math.pow(10,5)); 		// 광속 = 3 * 10^5
		System.out.println(lightSpeed + "km/s - 빛의 속도");
		
		double lightYear = lightSpeed * (60*60*24*365); //광속을 365일을 초단위로 합하여 광년을 계산
		
		System.out.println(lightYear + "km/s = 1광년");

		double ProximaLightYear = distance / lightYear; //시간(t) = 거리(s) / 속도(v)

		System.out.println("지구에서 빛의속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은" + ProximaLightYear + "광년이다.");
	}

}