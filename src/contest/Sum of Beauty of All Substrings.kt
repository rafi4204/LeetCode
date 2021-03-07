package contest

class Solution6 {
    fun beautySum(s: String): Int {
        var result = 0
        for (i in s.indices) {
            val map = hashMapOf<Char, Int>()

            for (len in i + 1..s.length) {
                if (map[s[len]] == null)
                    map[s[len]] = 1
                else
                    map[s[len]] = map[s[len]]!! + 1
                if (map.size == 1 || map.isEmpty())
                    continue
                else {
                    val temp = map.values.sortedDescending()
                    result += temp[0] - temp[temp.size - 1]
                }
            }


        }
        return result

    }
}

fun main() {
    val sol = Solution6()
    print(sol.beautySum("blwdfjnhvabjuhvzawmkkfvajucwzfknamfhchfcgpbjtlpkaftjebhbyhyorhvtrmrwxvbmipijdxpegmvwpgrlwdkydhwziaveadbkjpmqkyaeuhgsvtyxhfbngklmnlhcpftgbyuybgyobeyuhcgjwpjcxhvlhhggocprrmaxmjemotstvrlxauhguyrfyqyicsybanavfmymmajbqshtjpaqoervtlfutxwuwrnlbzgzqipnwflkzcbitbkpubaukvhwfjuzckgnbsnqqgkmhsexapmdidcxbfgbrmilsgrfqmrfcinlvgcgopazhxwpsrvxelenaxaskmdqwjjivmzijeupkwqfotojupxfxgtdgqschlcobevepzopsxvotvoloyqlzmyvhjduiwkuptkhzutudmqojjiyfitvlbyime"))
}