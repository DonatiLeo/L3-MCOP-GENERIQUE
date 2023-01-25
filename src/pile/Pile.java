package pile;

import java.util.ArrayList;

public class Pile<T> {
	private ArrayList<T> tab = new ArrayList<>();
	
	public void pousse(T t) {
		tab.add(t);
	}
	public T tire() {
		int lastIndex = tab.size()-1;
		return tab.remove(lastIndex);
	}
	int size() {
		return tab.size();
	}
	@Override
	public String toString() {
		return tab.toString();
	}
}
