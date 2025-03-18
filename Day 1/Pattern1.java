// Rectangular Star Pattern
//Time Complexity: n*n
//Space Complexity: O(1)

import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        for (int i=0; i<num; i++){          // outer loop for rows
            for (int j=0; j<num; j++){      // outer loop for columns
                System.out.print("*");
            }
            System.out.println();           // To move to next line after printing each row
        }
        scanner.close();
    }
}


