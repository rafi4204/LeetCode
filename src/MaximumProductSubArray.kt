import java.lang.Integer.max
import kotlin.math.min


class Solution {
    fun maxProduct(nums: IntArray): Int {
        var maxInt = -9999999
        var maxV = 1
        var minV = 1
        var tempMax = 1
        for (i in nums.indices) {
            tempMax = Math.max(nums[i] * maxV, Math.max(nums[i] * minV, nums[i]))
            minV = Math.min(nums[i] * maxV, Math.min(nums[i] * minV, nums[i]))
            maxV = tempMax
            maxInt = Math.max(maxV, maxInt)

        }
        return maxInt
    }

    fun isLongPressedName(name: String, typed: String): Boolean {
        var i = name.length - 1
        var j = typed.length - 1
        var l = 1
        var flag = true
        var count = IntArray(name.length)
        count[0] = 1
        for (k in 1 until name.length) {
            if (name[k] == name[k - 1]) {
                l++
                count[k] = l
            } else {
                l = 1
                count[k] = l
            }
        }
        while (j >= 0 /*|| i < name.length*/) {
            if (name[i] != typed[j]) {
                i--
                if (name[i] != typed[j]) {
                    flag = false
                    return false
                }
                j--
            } else {
                for (m in 1..count[i]) {
                    if (name[i] != typed[j]) {
                        flag = false
                        return flag
                    } else {
                        i--
                        j--
                    }
                }
            }

        }
        return flag
    }


}

fun main() {
    val sol = Solution()
    println(sol.isLongPressedName("alex", "aaleex"))
}