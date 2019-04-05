import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Test1.test1();
        Scanner sc = new Scanner(System.in);
//        System.out.println("Hello World!");
//    }

        //    public static void main(String[] args){
//        Scanner done = new Scanner (System.in);
//
////  a ,b are variabls
////        System.out.println("Write a number");
////        int  a = done.nextInt();
////        System.out.println("Write an other number");
////        int b = done.nextInt();
////        int cats = a+b;
////        System.out.println();
////        System.out.println("You have cats: " + cats);
//
//
//        System.out.println("Write your cat name");
////next() reads only one name,
//// if you have two names with space us nextLine()
//        String name = done.next();
//        System.out.println();
//        System.out.println(name + " " + " - This is nice cat name");
//
//
//
//
//    }
//    public static void main(String[] args) {
//        System.out.println("Write a number");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("Write an other number");
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println();
//        System.out.println("number is: " + sum);
//
//
//

//        public class Main {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                int n1 = 0, n2 = 0, n3 = 0;
//                int small = 999, large = -999; // taking a random value for 'small' and 'large' variables for convenience in comparing
//
//
//                // Taking inputs using Scanner class
//
//                System.out.println("Enter 1st number");
//                n1 = sc.nextInt();
//                System.out.println("Enter 2nd number");
//                n2 = sc.nextInt();
//                System.out.println("Enter 3rd number");
//                n3 = sc.nextInt();
//
//                //In order to find the largest and the smallest the numbers cannot be same. So I'm eliminating that option.
//
//                if (n1 == n2 && n2 == n3 && n3 == n1)
//
//                    System.out.println("Error! Numbers are equal");
//
//                else {
//
//            /*It might happen that two numbers are equal while the third number is different.
//            In that case I'm assigning an arbitrary value to one of the number(-99).
//            The purpose of this is to avoid the condition of equality of any two numbers*/
//
//                    if (n1 == n2) n1 = -99;
//                    if (n2 == n3) n2 = -99;
//                    if (n3 == n1) n3 = -99;
//
//                    // *********MAIN CODE**********
//            /* Considering each number separately and comparing it with 'small' and 'large'
//            variables which have values assigned by me
//            The condition of equality or repetition of numbers is eliminated
//            from the code by the help of the'not equal to' (!=) condition */
//
//                    if (n1 != -99) {
//                        if (n1 > large)
//                            large = n1;
//
//                        if (n1 < small)
//                            small = n1;
//                    }
//
//                    //In case the number is different than the assumed values,
//                    // 'large' and 'small' gets
//                    // changed to n1 and thus n2 is compared with n1. Same for n3.
//
//                    if (n2 != -99) {
//                        if (n2 > large)
//                            large = n2;
//
//                        if (n2 < small)
//                            small = n2;
//
//                    }
//                    if (n3 != -99) {
//                        if (n3 > large)
//                            large = n3;
//
//                        if (n3 < small)
//                            small = n3;
//
//                    }
//
//                    // Displaying the output
//                    System.out.println(" Largest number : " + large);
//                    System.out.println(" Smallest number : " + small);
//                }
//            }
//        }
//    public class Main {
//        public static void main(String[] args) {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Enter first number: ");
//            int n1 = in.nextInt();
//            System.out.println("Enter second number: ");
//            int n2 = in.nextInt();
//            System.out.println("Enter third number: ");
//            int n3 = in.nextInt();
//            System.out.println("Choices: ");
//            System.out.println("1) Largest number");
//            System.out.println("2) Smallest number");
//            System.out.println("Enter number corresponding to your choice: ");
//            int choice = in.nextInt();
//            in.close();
//            switch (choice) {
//                case 1:
//                    int largest = Math.max(n1, Math.max(n2, n3));
//                    System.out.printf("Largest : %d", largest);
//                    break;
//                case 2:
//                    int smallest = Math.min(n1, Math.min(n2, n3));
//                    System.out.printf("Smallest : %d", smallest);
//                    break;
//            }


//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
////        int a = sc.nextInt();
////        int b = sc.nextInt();
////
////        if (a>b) {
////            System.out.println("Hello");
////
////        }else{
////            System.out.println("Error");
////        }
////    }

//
//    }
//      public class Main {
//    public static void main(String[] args) {


//        double roundedResult = (int) (Math.random() * 100);
//        int guess = sc.nextInt();
//        if (guess < roundedResult) {
//            System.out.println("lower");
//        } else if (guess==roundedResult){
//            System.out.println("higer");
//        } else {
//            System.out.println("other");
//        }
////    }
//
//        double d = 9.5;
//        int i = (int) d;
//        //i = 9
//
//
//        Double D = 9.5;
//        int i = Integer.valueOf(D.intValue());
//        //i = 9
//        double d = 9.5;
//        Long L = Math.round(d);
//        int i = Integer.valueOf(L.intValue());
//        //i = 10
//    }
//        int result = (int) (Math.random()*10);
//        Scanner sc = new Scanner(System.in);
//        int guess = 1;
//        while (guess != result) {
//            guess = sc.nextInt();
//            System.out.println("your guess" + guess);
//        }
//        System.out.println(" " + guess + "was correct");
//    }
//    int b = 10%3
//// 10/3= 3/3 =1
////    17%5 = 2 jo 15 dalas ar 5 un 2 paliek pari tas ir tas kas nedalas ar 5

//        System.out.println("Please enter number of passengers:");


//        int passengers = sc.nextInt();

//        int taxis = 0;     // this is first solution
//        while (passengers > 0) {
//            taxis = taxis + 1;
//            passengers = passengers - 5;
//
//            if (passengers > 0) {
//                taxis = taxis + 1;
//                passengers = passengers - 7;
//            }
//        }
//        System.out.print(taxis + " taxis") ;
//    }
//}

//        int taxis = (passengers / 12) * 2; // this is second solution
//        int mod = passengers%12;
//        if(mod>5){
//            taxis=taxis+2;
//        }else if(mod>0){
//            taxis= taxis+1;
//        }else if (passenger == 0) break;
//        System.out.print(taxis + " taxis");
//
//    }
//}


//         int i=cars;
//
//        for (int i = 1; i < 100; i++) {
//            if ((i % 5 == 0) || (i % 7 == 0))
//                System.out.print(i + ", ");
//        }
//        for (int i = 1; i < 100; i++) {
//            if (i % 7 == 0) System.out.print(i + ", ");
//        }
//        System.out.println("you need total:" + i + " cars");
//    }
//}


//}
//      System.out.println("Please enter number (0 to end) of passengers:");
//        Scanner sc = new Scanner(System.in);
//
//       while(true){
//           int passenger = sc.nextInt();
//           if (passenger == 0) break {
//    }else if()
//            cars += passenger;
//
//
//        }
//     System.out.println("you need total:" + cars + " cars");

//        System.out.println("how cats?");
//        int cats = sc.nextInt();
//        String postfix = cats == 1 ? "cat!" : "cats!";
//        System.out.println(cats + postfix);
//    }}

//    int number = sc.nextInt();
//if(number <1 || number>7){
////        System.out.println("error");
////        return;
////
////        }
//int day = 4;
//     switch(day){
//          case 1:
//
//          System.out.println("Saturday");
//          break;
//          case 2:
//          System.out.println("Sunday");
//          break;
////default:
////        System.out.println("Error");
//
//        }}}

        //3001 print out 4 bc 3+0+0+1 digi numbers

//         int a = (int) '0';
//        int b = (int) '1';
//        System.out.println(a-48);
//        System.out.println(b-49);


//        String number = sc.next();
//        int sum = 0;
//        for (int index = 0; index < number.length(); index++) {
//
//
//            char digit = number.charAt(index);
//            int digitAsInt = (int) digit - 48;
//            sum += digitAsInt;
//
//        }
//        System.out.println(sum);
//    }
//}

//abcd
//dcba
//        String word = sc.nextLine();

//        for(int i = word.length()-1;i>=0;i--){
////            char c = word.charAt(i);
////            System.out.print(c);
////        }}}


        System.out.print("Input your first name: ");
        String fname = sc.nextLine();
        System.out.println("Hello " + fname + "!");
    }}













