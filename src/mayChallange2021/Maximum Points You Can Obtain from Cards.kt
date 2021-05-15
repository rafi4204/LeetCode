package mayChallange2021

class Solution7 {

    fun maxScore(cardPoints: IntArray, k: Int): Int {
        var mx = Long.MIN_VALUE
        var first = arrayListOf<Long>()
        var last = arrayListOf<Long>()
        first.add(0)
        last.add(0)
        for (i in 0 until k) {
            first.add(first[i] + cardPoints[i])
        }
        var l = 0
        for (i in cardPoints.size - 1 downTo cardPoints.size - k) {
            last.add(last[l++] + cardPoints[i])
        }
        var i = 0
        var j = last.size - 1
        while (i in first.indices && j in last.indices) {
            if (first[i] + last[j] > mx)
                mx = first[i] + last[j]
            i++
            j--
        }
        return mx.toInt()
    }


}