import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //Amar Input
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();

       //Akbar Input
        int age2 = sc.nextInt();
       int height2 = sc.nextInt();

       //Anthony Input
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();


//     Conditions
        if (age1 <= age2 && age1 <= age3)
            System.out.println("Amar is the youngest.");
        else if (age2 <= age1 && age2 <= age3)
            System.out.println("Akbar is the youngest.");
        else
            System.out.println("Anthony is the youngest.");

        if (height1 >= height2 && height1 >= height3)
            System.out.println("Amar is the tallest.");
        else if (height2 >= height1 && height2 >= height3)
            System.out.println("Akbar is the tallest.");
        else
            System.out.println("Anthony is the tallest.");
    }
}

