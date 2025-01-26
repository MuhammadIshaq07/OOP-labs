import java.util.Scanner;
public class Task_01{
	public static void main(String[] args){
		char[] const_arr = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character = scanner.next().charAt(0);
		boolean x = false;
		for(int i=0; i<const_arr.length; i++){
			if(character == const_arr[i]){
				x = true;
				break;
			}
		}
		if(x){
			System.out.print(" It is a consonant letter");
		}
		else{
			System.out.print(" It is not a consonant Letter");
		}
		
	}
	
}