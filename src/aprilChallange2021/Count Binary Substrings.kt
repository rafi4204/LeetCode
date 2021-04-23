package aprilChallange2021

class Solution10 {
    fun countBinarySubstrings(s: String): Int {
        var res = 0
        var count0 = 0
        var count1 = 0
        if (s[0] == '1')
            count1++
        else
            count0++

        for (i in 1 until s.length) {
            if (s[i - 1] == s[i] || (count0 == 0 || count1 == 0))
                if (s[i] == '1')
                    count1++
                else
                    count0++
            else if(count0 != 0 && count1 != 0) {
                res += Math.min(count0, count1)
                if (s[i] == '1')
                    count1 = 1
                else
                    count0 = 1

            }

        }
        return res
    }
}