package januray2021Challange

class Solution2 {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var j = nums.indexOf(1)
       for (i in j+1 until nums.size) {
            if (nums[i] == 1) {
                if (i - j - 1 < k)
                    return false
                j=i
            }
        }
        return true
    }
}