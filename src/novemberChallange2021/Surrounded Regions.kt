package novemberChallange2021

class Solution {
    val vis = Array(210) { IntArray(210) { -1 } }
    val dx = listOf(0, 0, 1, -1)
    val dy = listOf(1, -1, 0, 0)
    fun solve(board: Array<CharArray>): Unit {
        val list = arrayListOf<Pair<Int, Int>>()
        val map = hashMapOf<Pair<Int, Int>, Int>()
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 'O' && (i == 0 || i == board.size-1 || j == 0 || j == board[0].size-1))
                    list.add(Pair(i, j))
            }
        }
        list.forEach {
            vis[it.first][it.second] = 1
            dfs(it.first, it.second, map, board)
        }
        for (i in board.indices) {
            for (j in board[0].indices) {
                if (board[i][j] == 'O' && map[Pair(i, j)] != 1 )
                    board[i][j] = 'X'
            }
        }
    }

    fun dfs(ii: Int, jj: Int, map: HashMap<Pair<Int, Int>, Int>, board: Array<CharArray>) {
        map[Pair(ii, jj)] = 1
        for (i in dx.indices ) {

                if (ii + dx[i] in board.indices && jj + dy[i] in board[0].indices && board[ii + dx[i]][jj + dy[i]] == 'O' && vis[ii + dx[i]][jj + dy[i]] == -1) {
                    vis[ii + dx[i]][jj + dy[i]] = 1
                    map[Pair(ii + dx[i], jj + dy[i])] = 1
                    dfs(ii + dx[i], jj + dy[i], map, board)
                }

        }

    }
}

fun main(){
    val sol = Solution()
    sol.solve(arrayOf(charArrayOf('X','X','X','X'),charArrayOf('X','O','O','X'),charArrayOf('X','X','O','X'),charArrayOf('X','O','X','X')))
}