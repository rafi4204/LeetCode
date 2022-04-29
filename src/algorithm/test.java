package algorithm;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

class MaxFruitCountOf2Types {
    public static int findLength(char[] arr) {
        int i = 0;
        int mx = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            while (map.size() > 2) {
                map.put(arr[i], map.get(arr[i]) - 1);
                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }
                i++;
            }
            mx = Math.max(mx, j - i + 1);
        }
        return mx;
    }
}
