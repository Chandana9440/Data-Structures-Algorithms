// Rectangular Star Pattern
import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        for (int i=0; i<num; i++){
            for (int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

//Time Complexity: n*n
//Space Complexity: 
