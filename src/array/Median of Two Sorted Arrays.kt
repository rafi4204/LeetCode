package array

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val res = arrayListOf<Int>()
        res.addAll(nums1.toMutableList())
        res.addAll(nums2.toMutableList())
        res.sort()
        return if (res.size % 2 == 0) {
            (res[res.size / 2] + res[(res.size / 2) - 1]) / 2.00
        } else
            res[res.size / 2].toDouble()
    }
}