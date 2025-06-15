import java.util.*;
public class Voting{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int age=input.nextInt();

//	Positive Condition
	if(age>=18){
		System.out.println("The person's age is "+ age +" and can vote.");

	}
//  Negative Condition
		System.out.println("The person's age is "+ age +" and cannot vote.");

	}
}