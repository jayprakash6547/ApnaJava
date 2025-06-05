package Recursion;

public class SumofNaturalNum {
    public static void SumofNaturalNumbers(int n,int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }sum+=n;
        SumofNaturalNumbers(n-1,sum);
    }

    public static void main(String[] args) {
//int n=10;
SumofNaturalNumbers(5,0);
    }
}
