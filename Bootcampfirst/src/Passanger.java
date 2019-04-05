import java.util.Scanner;

public class Passanger{
    public static void passanger(String[] args) {

     System.out.println("Please enter number of passengers:");
        Scanner sc = new Scanner (System.in);
        int cars = sc.nextInt();

//        int i=cars;

        for (int i=0; i<100; i++){
            if (i%5==0 && i%7==0)
                System.out.println("You have cars: " + i);
        }
   }
}
