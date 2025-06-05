package TWoDimensionalArray;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int maxtrix[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxtrix[i][j]=sc.nextInt();
            }
        }
        for(int j=0; j<m ;j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(maxtrix[i][j] + " ");
            }
            System.out.println();
        }
        }
}
