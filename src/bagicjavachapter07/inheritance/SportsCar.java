package bagicjavachapter07.inheritance;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	@Override
	public void stop() { // 재정의 불가
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}
