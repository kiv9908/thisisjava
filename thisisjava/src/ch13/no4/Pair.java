package ch13.no4;

import lombok.Getter;

@Getter

public class Pair<K, V> {
	private K key;
	private V value;

	// 생성자로 초기화 중
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;

	}
}