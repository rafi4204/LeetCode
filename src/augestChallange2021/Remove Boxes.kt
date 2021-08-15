package augestChallange2021

class Solution6 {
    fun removeBoxes(boxes: IntArray): Int {
        boxes.sort()
        var c = 0
        var prv = boxes[0]
        var res = 0
        boxes.forEach {
            if (prv != it) {
                res += c * c
                c = 1
            } else {
                c++
            }
            prv = it
        }
        res += c * c

        return res
    }
}