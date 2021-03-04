package contest

class Solution4 {
    fun getCollisionTimes(cars: Array<IntArray>): DoubleArray {
        val stack = ArrayList<Int>()
        val res = DoubleArray(cars.size) { -1.0 }
        for (i in cars.size - 1 downTo 0) {
            val p = cars[i][0]
            val v = cars[i][1]
            while (stack.isNotEmpty()) {
                val j = stack.last()
                val p2 = cars[j][0]
                val v2 = cars[j][1]
                if (v <= v2 || 1.0 * (p2 - p) / (v - v2) >= res[j] && res[j] > 0)
                    stack.removeAt(stack.size-1)
                else
                    break
            }
            if (stack.isNotEmpty()) {
                val p2 = cars[stack.last()][0]
                val v2 = cars[stack.last()][1]
                res[i] = 1.0 * (p2 - p) / (v - v2)
            }
            stack.add(i)
        }
        return res
    }
}