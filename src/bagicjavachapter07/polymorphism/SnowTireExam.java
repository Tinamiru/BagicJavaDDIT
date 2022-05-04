package bagicjavachapter07.polymorphism;

public class SnowTireExam {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		NomalTire nomalTire = snowTire;

		snowTire.run();
		nomalTire.run();
	}
}
