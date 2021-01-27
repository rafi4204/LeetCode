package januray2021Challange

import java.lang.Integer.max
import java.util.*
import kotlin.collections.ArrayList

class Solution4 {
    private fun <T, U> seqs(it1: Iterable<T>, it2: Iterable<U>) =
        sequence { yieldAll(it1) }.zip(sequence { yieldAll(it2) })

    fun diagonalSort(mat: Array<IntArray>): Array<IntArray> {
        var l = Math.max(mat.size, mat[0].size)
        for (k in 0..l) {
            var ar = arrayListOf<Int>()
            for ((i, j) in seqs(k until mat.size, mat[0].indices))
                ar.add(mat[i][j])
            ar.sort()
           var m = 0
            if(ar.isNotEmpty()){
                for ((i, j) in seqs(k until mat.size, mat[0].indices)){
                    mat[i][j]=ar[m++]
                }
            }

            var ar2= arrayListOf<Int>()
            for ((i, j) in seqs(mat.indices, k until mat[0].size))
                ar2.add(mat[i][j])
            ar2.sort()
            var mm = 0
            if(ar2.isNotEmpty()){
                for ((i, j) in seqs(mat.indices, k until mat[0].size)){
                    mat[i][j] = ar2[mm++]
                }
            }

        }
        //print(mat)
       return mat

    }

    inner class ListOfList<T>{
        fun <T> add(list:T){

        }
    }
}

fun main() {
    val sol = Solution4()
    val a: IntArray = intArrayOf(3, 3, 1, 1)
    val b: IntArray = intArrayOf(2, 2, 1, 2)
    val c: IntArray = intArrayOf(1, 1, 1, 2)
    val d = arrayOf(a, b, c)
    print(sol.diagonalSort(d))
}