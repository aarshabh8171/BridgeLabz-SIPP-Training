import java.util.*;
public class Divfive{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int number=input.nextInt();

//Conditional
	if(number%5==0){
	System.out.println("The number is divisible by 5");
	}
   else{
	System.out.println(" Not divisible by 5 ");
	}
}
}