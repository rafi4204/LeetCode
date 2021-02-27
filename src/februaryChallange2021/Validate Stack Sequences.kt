package februaryChallange2021

import sun.security.provider.Sun
import java.util.*

class Solution27 {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {

        val push = Stack<Int>()
        val pop = Stack<Int>()
        if (pushed.isEmpty())
            return true
        popped.forEach { pop.add(it) }

        var i = 0

        push.push(pushed[0])
        while (i < pushed.size && pop.isNotEmpty() && push.isNotEmpty()) {

            if (push.lastElement() == pop.firstElement()) {
                push.pop()
                pop.removeAt(0)
                if (push.isEmpty() && i + 1 < pushed.size) {
                    push.push(pushed[i + 1])
                    i++
                }
          } else {
                if (i + 1 < pushed.size)
                    push.push(pushed[i + 1])
                i++
            }
            if (push.isEmpty() && pop.isEmpty())
                return true
        }

        return false
    }
}

fun main() {
    val sol = Solution27()
    sol.validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 5, 3, 2, 1))
}