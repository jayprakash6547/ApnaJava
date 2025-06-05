package Recursion;

public class PrintNTo1 {
    public static void Printnto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        Printnto1(n-1);
    }

    public static void main(String[] args) {
        int n=10;
//        System.out.println();
        Printnto1(n);
    }
}
