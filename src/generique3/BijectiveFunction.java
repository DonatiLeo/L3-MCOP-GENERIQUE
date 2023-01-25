package generique3;

public interface BijectiveFunction<T> {
	T apply(T t);
	T undo(T t);
}
