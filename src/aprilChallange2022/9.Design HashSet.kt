package aprilChallange2022

class MyHashSet() {
    private val hashMap = BooleanArray(1000001) { false }
    fun add(key: Int) {
        hashMap[key] = true
    }

    fun remove(key: Int) {
        hashMap[key] = false
    }

    fun contains(key: Int): Boolean {
        return hashMap[key]
    }

}