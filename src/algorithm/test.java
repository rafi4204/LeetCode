package algorithm;

class MinSizeSubArraySum {
    public static int findMinSubArray(int S, int[] arr) {
        int sum = 0;
        for(int i = 0 ; i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                sum = 0;
                for(int k = j;k<=i+j;k++){
                    sum+=arr[k];
                    if(sum>=S){
                        return i+1;
                    }
                }
            }
        }
        return -1;
    }
}
