import java.util.Arrays;

public class SecondLargest {
    public int getSecondLargest(int[] arr) {
        int n= arr.length;
        Arrays.sort(arr);
        for(int i=n-2;i>=0;i--){
            return  arr[i];
        }
        return -1;
    }
}
