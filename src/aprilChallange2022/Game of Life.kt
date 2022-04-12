package aprilChallange2022

class Solution6 {
    fun gameOfLife(board: Array<IntArray>): Unit {
        val dx = arrayOf(-1, 1, 0, 0, -1, -1, 1, 1)
        val dy = arrayOf(0, 0, 1, -1, -1, 1, -1, 1)

        for (i in board.indices) {
            for (j in board[0].indices) {
                var s = 0
                for (k in dx.indices) {
                    if (i + dx[k] in board.indices && j + dy[k] in board[0].indices) {
                        s += if (board[i + dx[k]][j + dy[k]] == 2)
                            0
                        else if (board[i + dx[k]][j + dy[k]] == -1)
                            1
                        else
                            board[i + dx[k]][j + dy[k]]
                    }
                }
                if (board[i][j] == 0) {
                    if (s == 3)
                        board[i][j] = 2
                } else if (board[i][j] == 1) {
                    if (s < 2 || s > 3)
                        board[i][j] = -1


                }
            }
        }

        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 2)
                    board[i][j] = 1
                else if (board[i][j] == -1)
                    board[i][j] = 0
            }


        }
    }
}