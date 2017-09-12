public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxHere = 0, max = 0;
        for (int n : nums){
        if(n==0){
            maxHere=0;
        }
        else{
            maxHere++;
        }
            max=Math.max(max,maxHere);
        }
           // max = Math.max(max, maxHere = n == 0 ? 0 : maxHere + 1);
        return max;
    }
}