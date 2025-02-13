import java.util.LinkedList;

class CustomHashMap {
    static class Entry {
        int key, value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final int SIZE = 10;
    private LinkedList<Entry>[] map;

    CustomHashMap() {
        map = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            map[i] = new LinkedList<>();
        }
    }

    private int getHash(int key) {
        return key % SIZE;
    }

    void put(int key, int value) {
        int hash = getHash(key);
        for (Entry entry : map[hash]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        map[hash].add(new Entry(key, value));
    }

    Integer get(int key) {
        int hash = getHash(key);
        for (Entry entry : map[hash]) {
            if (entry.key == key) {
                return entry.value;
            }
        }
        return null;
    }

    void remove(int key) {
        int hash = getHash(key);
        map[hash].removeIf(entry -> entry.key == key);
    }

    public static void main(String[] args) {
        CustomHashMap hashMap = new CustomHashMap();
        hashMap.put(1, 10);
        hashMap.put(2, 20);
        hashMap.put(12, 30);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(12));
        hashMap.remove(1);
        System.out.println(hashMap.get(1));
    }
}
