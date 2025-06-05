public class ZeroArrayTransformation1 {
    public boolean isZeroArray(int[] nums, int[][] queries) {
int n=nums.length;
int []max=new int[n+1];
for(int i[]:queries){
    max[i[0]]+=1;
    max[i[1]+1]-=1;
}
        for (int i = 1; i < max.length ; i++) {
            max[i]+=max[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)continue;
            if(nums[i]-max[i]>0)return false;
        }
        return true;
    }
}
