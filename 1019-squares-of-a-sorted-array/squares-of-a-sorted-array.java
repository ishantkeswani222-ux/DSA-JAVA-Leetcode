class Solution {
    public int[] sortedSquares(int[] num) {
        int[] res = new int[num.length];
        int i = 0;
        int j = num.length-1;
        int k = num.length-1;
        while(i<=j) {
            if(Math.abs(num[i]) > Math.abs(num[j]) ) {
                res[k] = num[i] * num[i];
                i++;
                k--;
            }
            else {
                res[k] = num[j]*num[j];
                j--;
                k--; 
            }
       

        }
          return res;

    }
}