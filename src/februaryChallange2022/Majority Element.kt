package februaryChallange2022

class Solution5 {
    fun majorityElement(nums: IntArray): Int {
        var c = 1
        var maj = -1
        nums.forEach {
            if (maj == it) {
                c++
            } else {
                c--
                maj = it
                if (c == 0) {
                    c = 1
                }
            }
        }

        return maj
    }
}