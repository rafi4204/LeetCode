package aprilChallange2021

class Solution1 {
    fun longestValidParentheses(s: String): Int {
        var max = 0
        var stk = arrayListOf<Int>()
        stk.add(-1)
        for (i in s.indices) {
            if (s[i] == '(') {
                stk.add(i)
            } else if (s[i] == ')') {
                stk.removeAt(stk.size - 1)
                if (stk.isEmpty())
                    stk.add(i)
                else
                    max = Math.max(max, i - stk.last())
            }
        }
        return max
    }
}