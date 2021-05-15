package contest

class Solution14 {
    fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
        var em = 0
        var m = box.size
        var n = box[0].size
        var temp = Array(n) { CharArray(m) }

        for (i in 0 until m) {
            em = 0
            for (j in n - 1 downTo 0) {
                if (box[i][j] == '*') {
                    em = 0
                }
                if (box[i][j] == '.')
                    em++
                if (box[i][j] == '#'){
                    box[i][j] = '.'
                    box[i][j + em] = '#'
                }

            }
        }
        for (i in m-1 until 0)
            for (j in n-1 downTo 0) {
                temp[j][i] = box[i][j]
            }
        return temp
    }
}