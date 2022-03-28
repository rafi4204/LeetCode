package marchChallenge2022

class Solution4 {
    class Solution {
        fun search(nums: IntArray, target: Int): Boolean {
            var l = 0
            var r = nums.size - 1
            while (l <=r) {
                val m =l+((r-l)/ 2)
                if (nums[m] == target || nums[l] == target || nums[r] == target) return true
                if ((nums[l] == nums[r]) && (nums[r]==nums[m])){
                    l++
                    r--
                }
                else {
                    if (nums[m] > target) {
                        if (nums[m] >= nums[l]) {
                            if (nums[l] < target)
                                r = m-1
                            else
                                l = m+1

                        } else
                            r = m -1
                    } else if (nums[m] < target) {
                        if (nums[m] > nums[l])
                            l = m+1
                        else if (nums[m] <= nums[r]) {
                            if (nums[r] > target)
                                l = m+1
                            else
                                r = m-1
                        } else
                            l = m+1

                    }
                }
            }
            return false
        }
    }
}