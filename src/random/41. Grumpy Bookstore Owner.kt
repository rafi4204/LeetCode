package random

import kotlin.test.currentStackTrace

class Solution41 {
    fun maxSatisfied(customers: IntArray, grumpy: IntArray, minutes: Int): Int {
        var j = 0
        var max = 0
        var sum1 = 0
        var sum2 = 0
        for (i in grumpy.indices) {
            if (grumpy[i] == 0)
                sum1 += customers[i]
        }

        for (i in customers.indices) {
            if (grumpy[i] == 1)
                sum2 += customers[i]
            if (i - j + 1 == minutes) {
                max = max.coerceAtLeast(sum2)
                if (grumpy[j] == 1)
                    sum2 -= customers[j]
                j++
            }
        }

        return sum1 + max
    }
}