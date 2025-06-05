package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        int x=sc.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                System.out.println("found at "+i);
            }

        }
    }
}
