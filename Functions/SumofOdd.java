package Functions;

public class SumofOdd {
    public static int SumOfOddNumbers(int n){
        int sum=0;
        for (int i = 1; i <=n; i++) {
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(SumOfOddNumbers(n));
    }
}
