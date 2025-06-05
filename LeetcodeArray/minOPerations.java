package LeetcodeArray;

public class minOPerations {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int totalSum=0;
        for (int i = 0; i < n; i++) {
            totalSum+=nums[i];
        }
        int remainder=totalSum%k;
        if(remainder==0){
            return 0;
        }
        return remainder;


    }
}
