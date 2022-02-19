package januray2021Challange

import sun.awt.geom.Crossings
import java.util.*

class Solution7 {
    fun minimumDeviation(nums: IntArray): Int {
        val treeSet  = TreeSet<Int>()
        var md = 0
        nums.forEach {
            if(it%2==0)
                treeSet.add(it)
            else
                treeSet.add(it*2)
        }
        md = treeSet.last()-treeSet.first()

        while(treeSet.size>0 && treeSet.last()%2==0){

            val last = treeSet.last()
            treeSet.remove(last)
            treeSet.add(last/2)
            md= md.coerceAtMost(treeSet.last() - treeSet.first())
        }
        return md
    }
}