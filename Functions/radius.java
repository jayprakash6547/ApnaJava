package Functions;

import java.util.Scanner;

public class radius {
    public static int CircumferenceOfCircle(int radius){
        int ans=2*(22/7*(radius));
//        return ans*22/7;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(CircumferenceOfCircle(r));
    }
}
