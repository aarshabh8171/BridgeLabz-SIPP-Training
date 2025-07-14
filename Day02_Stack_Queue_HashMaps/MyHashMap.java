package Day02_Stack_Queue_HashMaps;

import java.util.*;

class MyHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++)
            buckets[i] = new LinkedList<>();
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // Overwrite if key exists
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key))
                return entry.value;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K k, V v) {
            key = k;
            value = v;
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        System.out.println("Apple => " + map.get("Apple"));
        map.remove("Apple");
        System.out.println("Apple after deletion => " + map.get("Apple"));
    }
}
