package random

class Solution33 {
    fun numOfSubarrays(arr: IntArray, k: Int, threshold: Int): Int {
        var i = 0
        var sum = 0
        var c =0
        for (j in arr.indices) {
             sum+=arr[j]
            while(j-i+1==k){
                if(sum/3>=threshold)
                    c++
                sum-=arr[i++]
            }

        }
        return c
    }
}