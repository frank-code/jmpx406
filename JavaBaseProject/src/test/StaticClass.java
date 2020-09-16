package test;

public class StaticClass {

	private int a= 10;
	private static int b = 20;
	
	public static void main(String[] args) {
		StaticClass staticClass = new StaticClass();
		staticClass.add();
		StaticClass staticClass02 = new StaticClass();
		System.out.println(b);
		System.out.println(staticClass02.b);
	}
	
	public static void add() {
		b++;
	}
}
