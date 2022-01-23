package dp

class Solution5 {

    fun tribonacci(n: Int): Int {
          val mem = hashMapOf<Int,Int>()
        mem[0] = 0
        mem[1] = 1
        mem[2] = 1
        for(i in 3..n){
            mem[i] = mem[i-3]!!+mem[i-2]!!+mem[i-1]!!
        }
        return mem[n]!!
    }

}