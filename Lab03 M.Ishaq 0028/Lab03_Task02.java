import java.util.Scanner;
class Task_02{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String text = input.nextLine();
		String reverse = "";
		for(int i=text.length()-1; i>=0; i--){
			reverse = reverse+ text.charAt(i);
		}
		if(reverse.equals(text)){
			System.out.print("It is Palindrome");
		}
		else{
			System.out.print("It is not Palindrome");
		}
	}
}