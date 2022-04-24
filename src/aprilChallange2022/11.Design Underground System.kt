package aprilChallange2022

class UndergroundSystem() {
    val count = hashMapOf<Pair<String, String>, Int>()
    val total = hashMapOf<Pair<String, String>, Int>()
    val arrival = hashMapOf<Int, Pair<String, Int>>()

    fun checkIn(id: Int, stationName: String, t: Int) {
        arrival[id] = Pair(stationName, t)
    }

    fun checkOut(id: Int, stationName: String, t: Int) {

        if (total[Pair(arrival[id]?.first!!, stationName)] == null)
            total[Pair(arrival[id]?.first!!, stationName)] = t - arrival[id]?.second!!
        else
            total[Pair(arrival[id]?.first!!, stationName)] =
                total[Pair(arrival[id]?.first, stationName)]!! + t - arrival[id]?.second!!
        if (count[Pair(arrival[id]?.first!!, stationName)] == null)
            count[Pair(arrival[id]?.first!!, stationName)] = 1
        else
            count[Pair(arrival[id]?.first!!, stationName)] = count[Pair(arrival[id]?.first, stationName)]!! + 1
    }

    fun getAverageTime(startStation: String, endStation: String): Double {
        return (total[Pair(startStation, endStation)]!!.toDouble() / count[Pair(startStation, endStation)]!!.toDouble())
    }

}