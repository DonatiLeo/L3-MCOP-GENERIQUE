package generique3;

public class Test {
	
	public static void main(String[] args) {
		double x = 42;
		LogExp calcul = new LogExp();
		System.out.println(x);
		System.out.println(calcul.apply(x));
		System.out.println(calcul.undo(calcul.apply(x)));
	}
}
