package april



import java.util.PriorityQueue

class KthLargest(val k: Int, nums: IntArray) {
    val q = PriorityQueue<Int>()

    init {
        nums.forEach {
            add(it)
        }
    }

    fun add(`val`: Int): Int {
        q.add(`val`)
        if(q.size>k)
            q.poll()
       return q.peek()
    }

}
fun main(){
    val sol = KthLargest(3, intArrayOf(4,5,8,2))
    sol.add(3)
    sol.add(5)
    sol.add(10)
    sol.add(9)
    sol.add(4)
}

