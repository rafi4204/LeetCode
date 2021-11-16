package novemberChallange2021

import java.util.*

class Solution4 {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val res = IntArray(temperatures.size) { 0 }
        val stack = Stack<Int>()
        var i = 1
        stack.push(0)
        while (i in temperatures.indices) {
            if (!stack.isEmpty() && temperatures[stack.lastElement()] >= temperatures[i])
                stack.push(i)
            else {
                while (!stack.isEmpty() && temperatures[stack.lastElement()] < temperatures[i]) {
                    res[stack.lastElement()] = i - stack.pop()

                }
                stack.push(i)

            }
            i++

        }
        return res
    }
}

fun main(){
    val sol = Solution4()
    sol.dailyTemperatures(intArrayOf(73,74,75,71,69,72,76,73))
}