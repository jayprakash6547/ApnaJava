package pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static class pattern5 {
        public static void main(String[] args) {
            int n=4;
            for (int i=n;i>=1;i--){
                for(int j=1;j<i;j++){
                    System.out.print(" ");
                }
                for(int j=0; j<=n-i; j++) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }
}
