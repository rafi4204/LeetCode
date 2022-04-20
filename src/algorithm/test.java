package algorithm;

class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
        int sum = 0;
        int s = 0;
        int e = 0;
        int min = Integer.MAX_VALUE;
        while(s<=e && s<arr.length && e<arr.length){
            while(sum<S) {
                sum += arr[e++];
            }
            min = Math.min(min,e-s+1);
            while(sum>=S){
                sum-=arr[s++];
            }


        }
        return min;
    }
}
