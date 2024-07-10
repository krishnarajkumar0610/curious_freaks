package freak_coding.curious_freaks;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class MinMaxInArr {
    public Pair<Long, Long> getMinMax(int[] arr) {
        if(arr == null || arr.length == 0)
            return null;
        long min = arr[0];
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }
        return new Pair<Long,Long>(min,max);
    }
}