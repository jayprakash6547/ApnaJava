package TWoDimensionalArray;

import java.util.Scanner;

public class SprialMatrix {
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
        System.out.println("The order of Spiral Matrix is: ");
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;

        while(rowStart<=rowEnd &&colStart <=colEnd){
            for (int col = colStart; col < colEnd; col++) {
                System.out.print(maxtrix[rowStart][col]+ " ");
            }
            rowStart++;

            for (int row = rowStart; row < rowEnd; row++) {
                System.out.print(maxtrix[row][colEnd]+ " ");
            }
            colEnd--;

//3
            for (int col = colEnd; col >=colStart ; col--) {
                System.out.print(maxtrix[rowEnd][col]+ " ");
            }
            rowEnd--;
            
            
//            4

            for (int row = rowEnd; row >=rowStart ; row--) {
                System.out.print(maxtrix[row][colStart]+ " ");
            }
            colStart++;
            System.out.println();
        }
    }
}
