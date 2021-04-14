package aprilChallange2021

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation*/
/*class NestedInteger {
    // Constructor initializes an empty nested list.
    constructor()

    // Constructor initializes a single integer.
    constructor(value: Int)

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    fun isInteger(): Boolean{}

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    fun getInteger(): Int?{}

    // Set this NestedInteger to hold a single integer.
    fun setInteger(value: Int): Unit{}

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    fun add(ni: NestedInteger): Unit{}

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    fun getList(): List<NestedInteger>?{}
}*/


class NestedIterator(nestedList: List<NestedInteger>) {
    val list = arrayListOf<Int>()
    var i = -1

    init {
        makelinearList(nestedList)
    }

    private fun makelinearList(nestedList: List<NestedInteger>) {
        nestedList.forEach {
            if (it.isInteger()) {
                list.add(it.getInteger()!!)
            } else
                makelinearList(it.getList()!!)
        }
    }

    fun next(): Int {

        return list.get(++i)

    }

    fun hasNext(): Boolean {
        return i + 1 < list.size

    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */