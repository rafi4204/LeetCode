package twoPointers

class Solution8 {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        var i = m-1
        var j = n-1
        var k = nums1.size-1
        while (i in nums1.indices && j in nums2.indices) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i]
                i--
            } else {
                nums1[k--] = nums2[j]
                j--
            }

        }

        if (j >= 0) {
            while (j >= 0)
                nums1[j] = nums2[j--]

        }
    }

    fun F(i: Int): Int {
        var i = i
        return if (i < 2) {
            i + F(++i) + F(++i)
        } else i
    }
}

fun main(){
    val sol = Solution8()
    print(sol.F(0))
}