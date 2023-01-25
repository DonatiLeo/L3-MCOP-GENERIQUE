/**
 * 
 */
package generique2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author donati
 *
 */
public class FoncGenerique {

	public static <T extends Collection>  int calculeTaille(T t) {
		return t.size();
	}
	
	public static void main(String[] args) {
		ArrayList<String> val = new ArrayList<>();
		val.add("Marc");
		val.add("Emma");
		int n = calculeTaille(val);
		System.out.println(n);
	}

}
