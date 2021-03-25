package marchChallange2021

class Solution18 {
    fun threeSumMulti(arr: IntArray, target: Int): Int {
        val map = hashMapOf<Int, Int>()
        var res = 0
        for (i in 0 until arr.size) {
            res = (res + if (map[target - arr[i]] == null) 0 else map[target - arr[i]]!!) % 1000000007
            for (j in 0 until i)
                map[arr[j] + arr[i]] = if (map[arr[j] + arr[i]] == null) 1 else map[arr[j] + arr[i]]!! + 1
        }
        return res
    }
}