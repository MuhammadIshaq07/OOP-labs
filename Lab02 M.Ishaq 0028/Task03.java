import java.util.Scanner;

class Task3{
 public static void main(String [] args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows: ");
int row = scanner.nextInt();
System.out.println("Enter the number of coloumns: ");
int col = scanner.nextInt();

int[][] mat1 = new int[row][col]; 
int[][] mat2 = new int[row][col];

System.out.println("Enter the numbers of first matrix: ");
   for(int i=0 ; i<row; i++){
   for(int j=0; j<col; j++){

   mat1[i][j] = scanner.nextInt();
}
}

System.out.println("Enter the numbers of second matrix: ");
   for(int i=0 ; i<row; i++){
   for(int j=0; j<col; j++){
   mat2[i][j] = scanner.nextInt();
}
}
 System.out.println("Sum of Matrices: ");
   for (int i=0; i<row; i++){
   for(int j=0; j<col; j++){
   System.out.println(mat1[i][j] + mat2[i][j]);
 
}
}
}
}