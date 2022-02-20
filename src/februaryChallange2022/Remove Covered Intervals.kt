package februaryChallange2022

class Solution4 {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
      intervals.sortWith(object:Comparator<IntArray>{
          override fun compare(o1: IntArray?, o2: IntArray?): Int {
              return o1?.get(0)!! - o2?.get(0)!!
          }

      })
        var left = -1
        var right = -1
        var res = 0
        intervals.forEach {
            if(it[0]>left&&it[1]>right){
                left = it[0]
                res++
            }
            right = Math.max(right,it[1])
        }
        return res

    }
}