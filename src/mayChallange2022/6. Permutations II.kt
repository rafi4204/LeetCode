package mayChallange2022

class Solution6 {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        var res = arrayListOf<ArrayList<Int>>()
        val map = hashMapOf<String, Int>()
        val map1 = hashMapOf<Int, Int>()
        perm(nums,  "", arrayListOf<Int>(), res, map, map1)
        return res
    }

    private fun perm(
        nums: IntArray,
        s: String,
        list: ArrayList<Int>,
        res: ArrayList<ArrayList<Int>>,
        map: HashMap<String, Int>,
        map1: HashMap<Int, Int>
    ) {

        if (list.size == nums.size) {
            if (map[s] == null) {
                val temp = arrayListOf<Int>()
                list.forEach { temp.add(it) }
                res.add(temp)
                map[s] = 1
            }
            return
        }
        for (i in nums.indices) {
            if (map1[i] == null) {
                var t = s
                t += nums[i].toString()
                map1[i] = 1
                list.add(nums[i])
                perm(nums,  t, list, res, map, map1)
                t.removeRange(t.length - 1, t.length)
                map1.remove(i)
                list.removeAt(list.size - 1)
            }
        }

    }
}

