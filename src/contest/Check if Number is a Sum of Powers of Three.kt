package contest

class Solution7 {
    fun checkPowersOfThree(n: Int): Boolean {
        return 1162261467 % n == 0
    }
}

fun main()
{
    val sol = Solution7()
    print(sol.checkPowersOfThree(12))
}