import java.util.*;
public class Naturalno{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int number=input.nextInt();

//	If the number is positive
	if(number>=0){
		System.out.println("Natural number");

	}
// Sum of the natural numbers
	int sum=number*(number+1)/2;
		System.out.println(sum);
    
	}
}