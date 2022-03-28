package random

import java.util.AbstractQueue
import java.util.PriorityQueue
import java.util.Queue

class Solution19 {
    fun canBeValid(s: String, locked: String): Boolean {
        val op = PriorityQueue<Int>()

        var one = 0
        var zero = 0
        for (i in s.indices) {
            if (s[i] == ')') {
                if (op.isEmpty()) {
                    if (locked[i] == '0')
                        op.add(i)
                    else
                        return false
                } else {
                    op.poll()
                }
            } else if (s[i] == '(') {
                op.add(i)
            }
        }
        if (op.isEmpty())
            return true
        if (op.isNotEmpty() && op.size % 2 != 0)
            return false
        while (op.isNotEmpty()) {
            val res = op.poll()
            if (res == 1)
                one++
            else
                zero++
        }
        return one <= zero

    }
}