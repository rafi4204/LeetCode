package februaryChallange2021

class Solution18 {
    fun maxArea(height: IntArray): Int {
        var l = 0
        var r = height.size-1
        var area :Long = 0
        while(l<r){
            val lh = height[l]
            val rh = height[r]
            area = Math.max(area,Math.min(lh,rh)*(rh-lh).toLong())
            if(lh<rh)
                l++
            else
                r--
        }
        return area.toInt()
    }
}