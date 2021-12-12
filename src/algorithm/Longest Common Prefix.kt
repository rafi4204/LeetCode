package algorithm

class Solution2 {
    //vertical slice method
    fun longestCommonPrefix(strs: Array<String>): String {
        var res = ""
        strs[0].filterIndexed { index, c ->
            for (str in strs) {
                if (index >= str.length || c != str[index])
                    return res

            }
            res += c
            true
        }
        return res

    }
}
