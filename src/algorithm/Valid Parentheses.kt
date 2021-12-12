package algorithm

import java.util.*

class Solution4 {
    fun isValid(s: String): Boolean {
        var stk = Stack<Char>()
        s.forEach {
            if (stk.isNotEmpty() && it == ')' && stk.peek() == '(')
                stk.pop()
            else if (stk.isNotEmpty() && it == '}' && stk.peek() == '{')
                stk.pop()
            else if (stk.isNotEmpty() && it == ']' && stk.peek() == '[')
                stk.pop()
            else
                stk.push(it)

        }
        return stk.isEmpty()
    }
}