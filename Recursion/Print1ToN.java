package Recursion;

public class Print1ToN {
    public static void Print1Ton(int n){
        if(n==0)
            return;
        Print1Ton(n-1);
            System.out.println(n);

    }

    public static void main(String[] args) {
int n=5;
Print1Ton(n);
    }
}
