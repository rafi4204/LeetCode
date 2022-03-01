package random

import java.util.TreeSet

class Solution18 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = hashMapOf<Char,Char>()
        val map1 = hashMapOf<Char,Char>()

        for(i in s.indices){
            if(map[s[i]]==null&&map1[t[i]]==null){
                map[s[i]] = t[i]

                map1[t[i]] = s[i]
            }else if(map[s[i]] != t[i])
                return false
        }
        return true
    }
}