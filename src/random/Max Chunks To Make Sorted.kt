package random

class Solution20 {
    fun maxChunksToSorted(arr: IntArray): Int {
        var curSum = 0
        var expSum = 0
        var res = 0
        for (i in arr.indices) {
            curSum += arr[i]
            expSum += i
            if (curSum == expSum) {
                res++
                expSum = 0
                curSum = 0
            }
        }
        return res
    }
}