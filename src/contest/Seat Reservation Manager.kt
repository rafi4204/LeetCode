package contest

import sun.misc.Queue
import java.util.*

class SeatManager(n: Int) {
    var queue = sortedSetOf<Int>()

    init {

        for (i in 1..n) {
            queue.add(i)
        }
    }


    fun reserve(): Int {
        val temp = queue.first()
        queue.remove(temp)
        return temp
    }

    fun unreserve(seatNumber: Int) {
        queue.add(seatNumber)




    }

}