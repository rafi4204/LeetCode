package februaryChallange2021

class Solution14 {
    fun numberOfSteps (num: Int): Int {
        var temp = num
        var count = 0
        while(temp>0){
            if(temp%2==0)
                temp=temp/2
            else
                temp--
            count++
        }
        return count
    }
}