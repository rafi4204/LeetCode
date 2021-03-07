package marchChallange2021

class MyHashMap() {

   val list = IntArray(1000000){-1}
    fun put(key: Int, value: Int) {
           list[key] = value
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    fun get(key: Int): Int {
        return list[key]
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    fun remove(key: Int) {
           list[key] = -1
    }

}
