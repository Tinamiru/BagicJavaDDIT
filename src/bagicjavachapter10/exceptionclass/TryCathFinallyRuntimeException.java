package bagicjavachapter10.exceptionclass;

public class TryCathFinallyRuntimeException {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(data1 + " + " + data2 + " = " + (value1 + value2));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("에러발생");
		} catch (NumberFormatException e) {
			System.err.println("숫자변환불가");
		} catch (Exception e) {

		}
	}
}
