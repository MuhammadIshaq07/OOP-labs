class Task_07{
public static void main(String[] args){
int[] arr ={11, 4, 67, 23, 18, 58};
int larger = arr[0];
int smaller = arr[0];

for(int i=0; i<arr.length; i++){
if(arr[i] < smaller) {
smaller = arr[i];
}
if(arr[i]>larger){
larger = arr[i];
}
}
System.out.println("Smallest number: " +smaller);
System.out.println("Largest number: " +larger);
if(larger % 2 ==0){
System.out.println("The largest number " + larger + " is a multiple of 2");
}
else{
System.out.println("The largest number " + larger + " is not a multiple of 2");
}
}
}