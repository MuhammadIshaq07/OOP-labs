import java.util.Scanner;
class Task_01{
public static void main(String[] args){
int x = 20;
int y = 30;
System.out.print("Prime numbers from "+x+" to "+y);
for(int i=x; i<=y; i++){
boolean prime = true;
	for(int j=2; j<=i; j++){
		if(i%j==0){
			prime =false;
			break;
		}
	}
	if(prime){
		System.out.println(i);
	}
}
}
}