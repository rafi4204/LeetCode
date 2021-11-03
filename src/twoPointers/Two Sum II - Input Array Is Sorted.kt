package twoPointers

class Solution4 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var s = 0
        var e = numbers.lastIndex
        while (s < e) {
            if (numbers[s] + numbers[e] == target)
                return intArrayOf(s + 1, e + 1)
            if (numbers[s] + numbers[e] > target)
                e--
            else
                s++
        }
        return intArrayOf(s + 1, e + 1)
    }
}