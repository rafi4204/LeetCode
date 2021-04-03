package contest

class Solution8 {
    fun squareIsWhite(coordinates: String): Boolean {
        var res = true
        if (coordinates[1].toInt() % 2 == 0) {
            if (((coordinates[0] - 'a') + 1) % 2 == 0)
                res = false

        } else {
            if (((coordinates[0] - 'a') + 1) % 2 != 0)
                res = false
        }
        return res
    }
}