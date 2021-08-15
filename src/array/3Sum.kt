package array

class Solution2 {
    /*fun threeSum(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        val map = hashMapOf<Int,Int>()
        nums.sort()
        nums.forEach { map[it] = 0 }
        for (i in nums.indices) {
            if (i != 0 && nums[i] == nums[i - 1]) continue
            for (j in i + 1 until nums.size) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue
                      if(map[-nums[i]-nums[j]] == 0 ) {
                          res.add(listOf(nums[i], nums[j], -nums[i]-nums[j]))
                          map[-nums[i]-nums[j]] = -1
                      }
                }
            }

        return res
    }*/

    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = arrayListOf<ArrayList<Int>>()
        nums.sort()
        for(i in nums.indices){
            if(i!=0 && nums[i]!=nums[i-1]){
                var    low = i+1
                var  high = nums.size-1
                while(low<high){
                    if(nums[low]+nums[high]==-nums[i]){
                        res.add(arrayListOf(nums[i],nums[low],nums[high]))
                        while(nums[low]==nums[low+1]) low++
                        while(nums[high]==nums[high-1]) high--

                        low++
                        high--
                    } else if(nums[low]+nums[high]<-nums[i]){
                        low++
                    }else{
                        high--
                    }

                }

            }
        }

        return res

    }
}