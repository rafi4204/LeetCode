package februaryChallange2021

import java.util.*
import kotlin.Comparator
import kotlin.collections.ArrayList

class FreqStack() {
    val list = arrayListOf<Int>()
    var mx = -99999
    val frqStak = hashMapOf<Int,ArrayList<Int>>()
    val map = hashMapOf<Int, Int>()


    fun push(x: Int) {
        list.add(x)
        if (map.containsKey(x))
            map[x] = map[x]!! + 1
        else
            map[x] = 1
        if(mx<map[x]!!)
            mx = map[x]!!
        if(frqStak.containsKey(map[x]))
        frqStak[map[x]]?.add(x)
        else{
            frqStak[map[x]!!] = arrayListOf(x)
        }
    }

    fun pop(): Int? {
       val temp :Int  = frqStak[mx]?.last()!!
       map[temp]=map[temp]!!-1
       frqStak[mx]?.removeAt(frqStak[mx]?.size!!-1)
        if(frqStak[mx].isNullOrEmpty()) {
            frqStak.remove(mx)
            mx--
        }
        return temp

    }

}
fun main(){
    val stq = FreqStack()
    stq.push(5)
    stq.push(7)
    stq.push(5)
    stq.push(7)
    stq.push(4)
    stq.push(5)
    stq.pop()
    stq.pop()
    stq.pop()
    stq.pop()
}