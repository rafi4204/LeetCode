package binarySearch

class Solution5 {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var r = arr.size - 1
        var mid = 0
        while (l < r) {
            mid = (l + r) / 2
            if (arr[mid] > arr[mid + 1])
                r = mid
            else
                l = mid + 1

        }
        return l
    }
}