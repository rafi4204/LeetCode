package janurayChallange2022

class Solution1 {
    fun partition(s: String): List<List<String>> {
        val path = arrayListOf<String>()
        val res = arrayListOf<ArrayList<String>>()
        rec(0,s,path,res)
        return res
    }

    private fun rec(index: Int, s: String, path: ArrayList<String>, res: ArrayList<ArrayList<String>>) {
        if(index==s.length){
            res.add(ArrayList(path))
           return
        }
        for(i in index until s.length){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1))
                rec(i+1,s,path,res)
                path.removeAt(path.size - 1)
            }
        }

    }

    private fun isPalindrome(s: String, index: Int, i: Int): Boolean {
          var start = index
        var end = i
        while(start<=end){
            if(s[start]!=s[end])
                return false
            start++
            end--
        }
        return true
    }
}

fun main(){
    val sol = Solution1()
    sol.partition("aab")
}