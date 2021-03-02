package marchChallange2021

class Solution2 {
    fun findErrorNums(nums: IntArray): IntArray {
        val map = hashMapOf<Int, Int>()
        var lost = 0
        var dup = 0
        nums.sort()
        var got = false
        var j = 1
        nums.forEach {
            if (map[it] != null)
                map[it] = map[it]!! + 1
            else
                map[it] = 1
            if (map[it]!! > 1) {
                dup = it
                j--
            }
            if (j != it && !got) {
                lost = j
                got = true
            }
            j++
        }
        if (lost == 0)
            lost = nums.size
        return intArrayOf(dup, lost)
    }
}

fun main() {
    val sol = Solution2()
    sol.findErrorNums(intArrayOf(3, 2, 3, 4, 6, 5))
}