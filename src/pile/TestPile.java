package pile;

public class TestPile {

	public static void main(String[] args) {
		Pile<Integer> pile1 = new Pile<>();
		pile1.pousse(3);
		pile1.pousse(7);
		pile1.pousse(34);
		System.out.println(pile1);
		System.out.println(pile1.tire());
		System.out.println(pile1);
		
		Pile<String> pile2 = new Pile<>();
		pile2.pousse("Leo");
		pile2.pousse("Marc");
		pile2.pousse("Emma");
		System.out.println(pile2);
		
	}

}
