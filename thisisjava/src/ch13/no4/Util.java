package ch13.no4;

public class Util {

	public static <K, V> V getValue(Pair<K, V> p, K key) {
		if (key.equals(p.getKey())) {
			return p.getValue();
		} else {
			return null;
		}
	}
}