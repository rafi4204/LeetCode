package mayChallange2022

import java.util.Deque
import java.util.Queue

class MyStack() {
    var queue: ArrayDeque<Int> = ArrayDeque<Int>()

    fun push(x: Int) {
        queue.addFirst(x)
    }

    fun pop(): Int {
        return queue.removeFirst()
    }

    fun top(): Int {
        return queue.first()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}
