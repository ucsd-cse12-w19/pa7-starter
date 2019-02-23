package ucsdcse12pa7student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * The Node class will hold all the contents for a BSTMap
 *
 * @param <K>
 * @param <V>
 */
class Node<K, V> {
	K key;
	V value;
	Node<K, V> left, right;

	public Node(K key, V value, Node<K, V> left, Node<K, V> right) {
		this.key = key;
		this.value = value;
		this.left = left;
		this.right = right;
	}
}

/**
 * This class is for use in the return of .entries()
 *
 * @param <K>
 * @param <V>
 */
class Entry<K, V> {
	K key;
	V value;

	public Entry(K key, V value) {
		this.key = key;
		this.value = value;
	}
}

/**
 * Read this class carefully.
 * 
 * You have to implement a handful of methods in it, and the existing methods
 * have lots of helpful patterns and hints.
 * 
 * @author joe
 *
 * @param <K>
 * @param <V>
 */
public class BSTMap<K, V> implements OrderedDefaultMap<K, V> {

	Node<K, V> root;
	int size;
	Comparator<K> comparator;
	V defaultValue;

	/**
	 * These constructors are provided to you to use; you shouldn't need others
	 */
	public BSTMap(Comparator<K> comparator, V defaultValue) {
		this.root = null;
		this.size = 0;
		this.comparator = comparator;
		this.defaultValue = defaultValue;
	}

	public BSTMap(Comparator<K> comparator) {
		this.root = null;
		this.size = 0;
		this.comparator = comparator;
		this.defaultValue = null;
	}

	/**
	 * Internal helper method for get
	 * 
	 * Recursive on the node argument. Throws NoSuchElementException if the key is
	 * not found in the tree and the defaultValue is null, returns the defaultValue
	 * if it is defined.
	 * 
	 * @param node
	 * @param k
	 * @return
	 */
	V get(Node<K, V> node, K k) {
		if (node == null) {
			if (this.defaultValue == null) {
				throw new NoSuchElementException(k.toString());
			} else {
				return this.defaultValue();
			}
		}
		if (this.comparator.compare(node.key, k) < 0) {
			return get(node.right, k);
		} else if (this.comparator.compare(node.key, k) > 0) {
			return get(node.left, k);
		} else {
			return node.value;
		}
	}

	@Override
	public V get(K key) {
		return this.get(this.root, key);
	}

	/**
	 * Internal helper method for set.
	 * 
	 * Recursive on the node argument. Returns a new node if it reaches a leaf,
	 * indicating that the key is not yet in the tree, otherwise it returns a
	 * reference to the Node that was passed in (after changing it).
	 * 
	 * @param node
	 * @param key
	 * @param value
	 * @return
	 */
	Node<K, V> set(Node<K, V> node, K key, V value) {
		if (node == null) {
			this.size += 1;
			return new Node<K, V>(key, value, null, null);
		}
		if (this.comparator.compare(node.key, key) < 0) {
			node.right = this.set(node.right, key, value);
			return node;
		} else if (this.comparator.compare(node.key, key) > 0) {
			node.left = this.set(node.left, key, value);
			return node;
		} else {
			node.value = value;
			return node;
		}
	}

	@Override
	public void set(K key, V value) {
		if (key == null) {
			throw new IllegalArgumentException();
		}
		this.root = this.set(this.root, key, value);
	}

	/**
	 * Internal helper method for containsKey.
	 * 
	 * Recursive on node.
	 * 
	 * @param node
	 * @param k
	 * @return true if the node is in the tree, false otherwise
	 */
	boolean containsKey(Node<K, V> node, K k) {
		if (node == null) {
			return false;
		}
		if (this.comparator.compare(node.key, k) < 0) {
			return containsKey(node.right, k);
		} else if (this.comparator.compare(node.key, k) > 0) {
			return containsKey(node.left, k);
		} else {
			return true;
		}
	}

	@Override
	public boolean containsKey(K key) {
		return this.containsKey(this.root, key);
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public V defaultValue() {
		return this.defaultValue;
	}

	// STUDENT: You will implement and test all the methods below this line

	@Override
	public List<K> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Entry<K, V>> entries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K floor(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public K ceiling(K key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<K> range(K low, K high) {
		// TODO Auto-generated method stub
		return null;
	}

}
