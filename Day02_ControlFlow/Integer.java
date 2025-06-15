import java.util.*;
public class Integer{
	public static void main (String [] args){
// Input
	Scanner input= new Scanner(System.in);
	int number=input.nextInt();

//	If the number is positive
	if(number>0){
		System.out.println("Negative");

	}
// Number is Negative
	else if(number<0)
	{
	System.out.println("Negative");
	}
	else{
		System.out.println("Zero");
    }
	}
}