fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
    var product = 1
    var res = 0
    var count = 0
    for (i in nums.indices) {
        product *= nums[i]
        if (product >= k) {
            res += (count * (count + 1)) / 2
            if (nums[i] < k) {
                count = 1
                product = nums[i]
            } else {
                count = 0
                product = 1
            }
        } else {
            count++
        }

    }
    return res
}
