package contest

class Solution6 {
    fun beautySum(s: String): Int {
        var result = 0
        for (i in s.indices) {
            for (len in i+1..s.length ) {
                result += countBeauty(s.substring(i, len))
            }
        }
        return result

    }

    fun countBeauty(s: String): Int {
        val map = hashMapOf<Char, Int>()
        s.forEach {
            if (map[it] == null)
                map[it] = 1
            else
                map[it] = map[it]!! + 1
        }
        if (map.size == 1 || map.isEmpty())
            return 0
        else {
            val temp = map.values.sortedDescending()
            return temp[0] - temp[temp.size - 1]
        }
    }
}

fun main(){
    val sol = Solution6()
    print(sol.beautySum("blwdfjnhvabjuhvzawmkkfvajucwzfknamfhchfcgpbjtlpkaftjebhbyhyorhvtrmrwxvbmipijdxpegmvwpgrlwdkydhwziaveadbkjpmqkyaeuhgsvtyxhfbngklmnlhcpftgbyuybgyobeyuhcgjwpjcxhvlhhggocprrmaxmjemotstvrlxauhguyrfyqyicsybanavfmymmajbqshtjpaqoervtlfutxwuwrnlbzgzqipnwflkzcbitbkpubaukvhwfjuzckgnbsnqqgkmhsexapmdidcxbfgbrmilsgrfqmrfcinlvgcgopazhxwpsrvxelenaxaskmdqwjjivmzijeupkwqfotojupxfxgtdgqschlcobevepzopsxvotvoloyqlzmyvhjduiwkuptkhzutudmqojjiyfitvlbyime"))
}