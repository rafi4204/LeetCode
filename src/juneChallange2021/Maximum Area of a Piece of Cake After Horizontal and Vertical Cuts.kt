package juneChallange2021

class Solution3 {
    fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
        horizontalCuts.sort()
        verticalCuts.sort()
        var prv = 0
        var width = Long.MIN_VALUE
        var height = Long.MIN_VALUE
        horizontalCuts.forEach {
            width = Math.max(width, (it - prv).toLong())
            prv = it
        }
        width = Math.max(width, (h - prv).toLong())
        prv = 0
        verticalCuts.forEach {
            height = Math.max(height, (it - prv).toLong())
            prv = it
        }
        height = Math.max(height, (w - prv).toLong())
        return ((height * width) % 1000000007).toInt()
    }
}