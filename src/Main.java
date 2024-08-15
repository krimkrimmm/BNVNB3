//bvn: thuc hien cho nguoi sdung nhập va kích thước mảng k được hardcode
// thuc hien tách ham(cách tách ham -> tu nghiên cứu)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)  ;
        int rowA, rowB, columnA, columnB ;
        System.out.println("Enter the number of rows of the 1st matrix: ");
        rowA = scanner.nextInt() ;
        System.out.println("Enter the number of columns of the 1st matrix: ");
        columnA = scanner.nextInt() ;
        System.out.println("Enter the number of rows of the 2nd matrix: ");
        rowB = scanner.nextInt() ;
        System.out.println("Enter the number of columns of the 2nd matrix: ") ;
        columnB = scanner.nextInt() ;
        int a[][] = new int[rowA][columnA] ;
        int b[][] = new int[rowB][columnB] ;
        if(rowA == rowB && columnA == columnB){
            System.out.println("Enter the numbers of the first matrix: ");
//            int c[][] = new int[rowA][columnA] ;
            for(int i = 0 ; i < rowA ; i++){
                for(int j = 0 ; j < columnA ; j++){
                    a[i][j] = scanner.nextInt() ;
                }
            }
            System.out.println() ;
            System.out.println("Enter the numbers of the second matrix: ");
            for(int i = 0 ; i < rowB ; i++){
                for(int j = 0 ; j < columnB ; j++){
                    b[i][j] = scanner.nextInt() ;
                    b[i][j] += a[i][j] ;
                }
            }
            System.out.println();
            System.out.println("The sum of both matrix is: ");
            for(int i = 0 ; i < rowA ; i++){
                for(int j = 0 ; j < columnA ; j++){
                    System.out.print(b[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Unable to proceed");
        }
    }
}