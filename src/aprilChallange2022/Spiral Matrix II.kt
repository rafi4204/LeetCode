package aprilChallange2022

class Solution7 {
    fun generateMatrix(n: Int): Array<IntArray> {
        var rowBegin = 0
        var rowEnd = n - 1
        var colBegin = 0
        var colEnd = n - 1
        val res = Array(n) { IntArray(n) { 0 } }
        var c = 1
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (i in colBegin..colEnd) {
                res[rowBegin][i] = c++
            }
            rowBegin++
            for (i in rowBegin..rowEnd) {
                res[i][colEnd] = c++
            }
            colEnd--
            if (rowEnd >= rowBegin) {
                for (i in colEnd downTo colBegin) {
                    res[rowEnd][i] = c++
                }
                rowEnd--
            }
            if (colEnd >= colBegin) {
                for (i in rowEnd downTo rowBegin) {
                    res[i][colBegin] = c++
                }
                colBegin++
            }
        }
        return res
    }
}