import java.util.Scanner;
class Task_06{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your age: ");
int number = scanner.nextInt();
System.out.print((number>=18)? "You are eligible for voting" : "You are not eligible for voting");
}
}