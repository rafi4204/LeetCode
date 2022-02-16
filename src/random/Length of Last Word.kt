package random

class Solution1 {
    fun lengthOfLastWord(s: String): Int {
       val str = s.trim()
        var c =  0
        for(i in str.length-1 downTo 0){
            if(str[i]==' ')
                break
            else c++
        }
        return c
    }
}