package februaryChallange2021

class Solution24 {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (target > matrix[matrix.size - 1][matrix[0].size - 1] || target < matrix[0][0])
            return false
        var i = matrix.size-1
        var j = 0
        while (i in matrix.indices && j in matrix[0].indices) {
            if (target == matrix[i][j])
                return true

            if(target<matrix[i][j])
                i--
            else
                j++

        }
        return false
    }
}