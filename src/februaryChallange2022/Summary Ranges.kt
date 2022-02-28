package februaryChallange2022

class Solution9 {
    fun summaryRanges(nums: IntArray): List<String> {
        val res = arrayListOf<String>()
        if(nums.size == 0) return res
        var prv = nums[0]
        for (i in 1..nums.size-1) {
            if (Math.abs(nums[i] - nums[i - 1]) > 1) {
                if (prv == nums[i - 1])
                    res.add("$prv")
                else
                    res.add("${prv}->${nums[i - 1]}")
                prv = nums[i]
            }
        }
        if (prv == nums[nums.size-1])
            res.add("$prv")
        else
            res.add("${prv}->${nums[nums.size-1]}")
        return res
    }
}