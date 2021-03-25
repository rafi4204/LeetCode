package marchChallange2021

class Solution17 {
    fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String> {
        val map = hashMapOf<String, String>()
        val map2 = hashMapOf<String, String>()
        val map3 = hashMapOf<String, String>()
        val res = Array(queries.size) { "" }

        wordlist.forEach {
            map[it] = it
        }
        wordlist.forEach {
            if (map2[it.toUpperCase()] == null)
                map2[it.toUpperCase()] = it
        }
        wordlist.forEach {
            var temp = it.toUpperCase()
            temp.forEach { it1 ->
                if (it1 == 'A' || it1 == 'E' || it1 == 'I' || it1 == 'O' || it1 == 'U')
                  temp = temp.replace(it1, '#')
            }
            if (map3[temp] == null)
                map3[temp] = it
        }
        for (i in queries.indices) {
            if (map[queries[i]] != null)
                res[i] = map[queries[i]]!!
            else if (map2[queries[i].toUpperCase()] != null)
                res[i] = map2[queries[i].toUpperCase()]!!
            else if (map3[isVowel(queries[i])] != null) {
                res[i] = map3[isVowel(queries[i])]!!

            } else
                res[i] = ""
        }
        return res
    }

    private fun isVowel(s: String): String {
        var temp = s.toUpperCase()
        temp.forEach { it1 ->
            if (it1 == 'A' || it1 == 'E' || it1 == 'I' || it1 == 'O' || it1 == 'U')
                temp = temp.replace(it1, '#')
        }
        return temp

    }
}

fun main(){
    val sol = Solution17()
  sol.spellchecker(arrayOf("KiTe","kite","hare","Hare"), arrayOf("kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto")).forEach {
        print(it+",")
    }
}