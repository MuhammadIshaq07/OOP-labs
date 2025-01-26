import java.util.Scanner;
class Task_04{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
String[] name =new String[6];

System.out.print("Enter names: ");
for(int i=0; i<name.length; i++){
name[i] = scanner.nextLine();
}

boolean x = false;
for(int i=0; i<name.length; i++){
if(name[i].equals("ali")){
x =true;
break;
}
}
if(x){
System.out.println("Ali is present.");
}
else{
System.out.println("Ali is not present.");
}
}
}