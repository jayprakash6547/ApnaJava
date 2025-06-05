class Solution {
    public int minElement(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int j = sum(nums[i]);
            nums[i] = j;
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(ans > nums[i]){
                ans = nums[i];
            }
        }
        return ans;
    }
    public int sum(int a){
        int x = 0;
        while(a>0){
            x += a%10;
            a = a/10;
        }
        return x;
    }
}