package januray2021Challange

import com.sun.jmx.snmp.SnmpUnsignedInt
import java.math.BigInteger
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType

class Solution5 {
    fun concatenatedBinary(n: Int): Int {
        var resultBinString = ""
        var ans :Long = 0
        for (i in 0 until n) {
           ans = (ans*(1.toLong() shl (decimalToBinary(i+1).length)) +(i+1))%1000000007
        }

        return ans.toInt()
    }

    fun binaryToDecimal(str: String): BigInteger {
        var j = 0
        var result: BigInteger = BigInteger.ZERO
        for (i in str.lastIndex downTo 0) {
            result += ((str[i].toInt() - 48).toBigInteger() shl j++)
        }
        return result
    }

    fun decimalToBinary(nn: Int): String {
        var flag = false
        var binary = ""
        var n = nn.toLong()
        for (i in 63 downTo 0) {
            var result = n shr i
            if ((result and 1) > 0) {
                binary += "1"
                flag = true
            } else {
                if (flag)
                    binary += "0"
            }

        }
        return binary
    }
}

fun main() {
    val sol = Solution5()
    print(sol.concatenatedBinary(12))
}