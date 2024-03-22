package ch13.no4;

public class ChildPair<K, V> extends Pair<K, V> {

	public ChildPair(K key, V value) {
		// 부모 클래스 생성자에 매개변수를 받아 실행하는 생성자만 존재하기 때문에 필요
		super(key, value);

	}

}