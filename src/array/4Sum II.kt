package array

class Solution5 {
    fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {

        nums1.sort()
        nums2.sort()
        nums3.sort()
        nums4.sort()
        val map = hashMapOf<Int,Int>()
        nums4.forEach {
            map[it]=1
        }
        var c = 0
        for (i in nums1.indices) {

            for (j in nums2.indices) {

                for (k in nums3.indices) {

                      if (map[-nums1[i] - nums2[j] - nums3[k]]!=null)
                            c++

                }
            }
        }

        return c

    }
}