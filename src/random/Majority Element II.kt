package random

class Solution8 {
    fun majorityElement(nums: IntArray): List<Int> {
        var num1 = Int.MIN_VALUE
        var num2 = Int.MIN_VALUE
        var c1 = 0
        var c2 = 0
        val res = arrayListOf<Int>()
        nums.forEach {
            if (num1 == it)
                c1++
            else if (num2 == it)
                c2++
            else if (c1 == 0) {
                num1 = it
                c1 = 1
            } else if (c2 == 0) {
                num2 = it
                c2 = 1
            } else {
                c1--
                c2--
            }
        }
        if (nums.count { it == num1 } > nums.size / 3)
            res.add(num1)
        if (nums.count { num2 == it } > nums.size / 3)
            res.add(num2)
        return res

    }
}