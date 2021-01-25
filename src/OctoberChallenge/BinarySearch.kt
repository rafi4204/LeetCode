package OctoberChallenge

import java.util.concurrent.CopyOnWriteArrayList

fun main(){

}

fun search(nums: IntArray, target: Int): Int {
    val num= CopyOnWriteArrayList<Int>()
    nums.forEach { num.add(it) }
    var start = 0
    var end = num.size-1
    var mid = 0
    while(start<=end){
        mid = (start+end)/2
        when {
            num[mid]==target -> return mid
            num[mid]>target -> end = mid-1
            num[mid]<target -> start = mid+1
        }

    }
    return -1
}