package array

class Solution4 {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val res = arrayListOf<ArrayList<Int>>()
        nums.sort()
        for (i in nums.indices) {
            if (i == 0 || (i != 0 && nums[i] != nums[i - 1])) {
                for (j in i + 1 until nums.size - 2) {
                    if (j==i+1 || (j != i+1 && nums[j] != nums[j - 1])) {
                        var low = j + 1
                        var high = nums.size - 1
                        while (low < high) {
                            if (nums[low] + nums[high] == target - nums[i] - nums[j]) {
                                res.add(arrayListOf(nums[i],nums[j],nums[low],nums[high]))
                                while(low<high&&nums[low]==nums[low+1]) low++
                                while(low<high&&nums[high]==nums[high-1]) high--
                                low++
                                high--
                            } else if(nums[low] + nums[high] < target - nums[i] - nums[j]){
                                low++
                            } else{
                                high--
                            }

                        }
                    }
                }
            }
        }

        return res

    }
}