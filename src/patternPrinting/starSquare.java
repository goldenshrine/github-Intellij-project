package patternPrinting;

import java.util.Scanner;

public class starSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number of rows");
        int m = sc.nextInt();
        System.out.println("please enter the number of collumns");
        int n = sc.nextInt();
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
