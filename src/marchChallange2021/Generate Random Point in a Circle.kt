package marchChallange2021

import java.lang.Math.PI
import kotlin.math.nextUp


class Solution13(val radius: Double, val x_center: Double, val y_center: Double) {

    fun randPoint(): DoubleArray {
        val r = x_center + y_center - radius
        var  y = Math.random() * 2 * radius + y_center - radius
        var   x = Math.random() * 2 * radius + x_center - radius
        while ((x_center - x) * (x_center - x) + (y_center - y) * (y_center - y) >= radius*radius) {
            y = Math.random() * 2 * radius + y_center - radius
            x = Math.random() * 2 * radius + x_center - radius
        }
        return doubleArrayOf(x, y)
    }

}