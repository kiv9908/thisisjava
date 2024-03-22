
package ch13.no3;

import lombok.Getter;

@Getter

public class Container<K, V> {

	private K key;
	private V value;

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
