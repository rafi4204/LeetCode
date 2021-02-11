package februaryChallange2021

import com.sun.istack.internal.Nullable

class PeekingIterator(val iterator: Iterator<Int>) : Iterator<Int> {
    var index = -1
    fun peek(): Int {
        return iterator.asSequence().elementAt(index + 1)
    }

    override fun next(): Int {
        var el : Int? = null
        if (iterator.hasNext()) {
            index++
            el = iterator.next()
        }
        return el
    }

    override fun hasNext(): Boolean {
        return iterator.hasNext()
    }
}

fun main() {
    val peekingIterator = PeekingIterator<String>(iterator { sequenceOf("PeekingIterator","next","peek","next","next","hasNext")})
    print(peekingIterator.peek())
    Iterable {   "PeekingIterator","next","peek","next","next","hasNext"}
}