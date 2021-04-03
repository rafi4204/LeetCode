package contest

class Solution9 {
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        var ar1 = sentence1.split(" ")
        var ar2 = sentence2.split(" ")
        if (ar2.size > ar1.size) {
            val temp = ar2
            ar2 = ar1
            ar1 = temp
        }
        ar2 = ar2.toMutableList()
        ar1 = ar1.toMutableList()
        while (ar2.isNotEmpty()) {
            when {
                ar2.first() == ar1.first() -> {
                    ar2=ar2.drop(1)
                    ar1=ar1.drop(1)
                }
                ar2.last() == ar1.last() -> {
                    ar2= ar2.dropLast(1)
                    ar1= ar1.dropLast(1)
                }
                else -> return false
            }
        }

        return true
    }
}

fun main() {
    val sol = Solution9()
    sol.areSentencesSimilar("of", "A lot of words")
}