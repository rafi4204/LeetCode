package februaryChallange2021

class Solution2 {
    fun findLHS(nums: IntArray): Int {
        val m = hashMapOf<Long,Int>()
        var mx = 0
        nums.forEach {
            if(m[it.toLong()]!=null)
                m[it.toLong()] = m[it.toLong()]?.plus(1)!!
            else
                m[it.toLong()] = 1
        }
        m.forEach{
              if(m[it.key+1.toLong()]!=null)
                  mx= Math.max(mx,it.value+ m[it.key+1.toLong()]!!)

        }
        return mx
    }
}