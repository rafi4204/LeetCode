package random

class Solution42 {
    fun minimumCardPickup(cards: IntArray): Int {
        var min = Int.MAX_VALUE
        var i = 0
        var isMatch = false
        val map = hashMapOf<Int, Int>()
        for (j in cards.indices) {
            map[cards[j]] = map.getOrDefault(cards[j], 0) + 1
            if (map[cards[j]]!! >= 2)
                isMatch = true
            while (isMatch) {
                min = Math.min(min, j - i + 1)
                if (map[cards[i]]!! >= 2) {
                    isMatch = false
                }
                map[cards[i]] = map[cards[i]]!! - 1
                i++
            }
        }
        return if (min == Int.MAX_VALUE) -1 else min
    }
}