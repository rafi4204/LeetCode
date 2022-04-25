package aprilChallange2022

import java.util.Queue

class PeekingIterator(val iterator: Iterator<Int>) : Iterator<Int> {
    var ar = ArrayList<Int>()
    var index = 0

    init {
        iterator.forEach {
            ar.add(it)
        }

    }

    fun peek(): Int {

        return ar[index]

    }

    override fun next(): Int {
        return ar[index++]
    }

    override fun hasNext(): Boolean {
        return ar.size > index
    }
}