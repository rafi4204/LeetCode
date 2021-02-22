package februaryChallange2021

class Solution22 {
    fun brokenCalc(X: Int, Y: Int): Int {
        if (X > Y) return X - Y
        if (X == Y) return 0
        return if (Y % 2 == 0)
            brokenCalc(X, Y / 2) + 1
        else
            brokenCalc(X, Y + 1) + 1
    }
}