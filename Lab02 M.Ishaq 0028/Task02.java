import java.util.Scanner;
public class Task_02{
    public static void main(String[] args){
        int[] numbers = new int[10];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 integers:");
        for(int i=0; i<10; i++){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        System.out.print("Multiples of 4 are: ");

        for (int i=0; i<numbers.length; i++){
        int num = numbers[i];
        if(num % 4 ==0){
        System.out.print(num + " ,");
        sum = sum + num;
        }
    }
        System.out.println();
        System.out.println("Sum of multiple of 4 is: " + sum);
    }
}
