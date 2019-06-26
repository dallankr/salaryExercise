import java.lang.reflect.Type;
import java.util.Scanner;

//import java.text.DecimalFormat;
//import java.util.Scanner;
//
public class Main {
    public static void main(String[] args) {
//        System.out.println("10");
//        System.out.println(String.format("%,.2f", 1.22));
//        System.out.println(1234+532);
//        System.out.println(1234-532);
//        /*ayy lmao*/
//        System.out.println(1234*532);
//        System.out.println((float)1234/532);

        ////////////////////////////////////////////////////


            String newProduct = "yes";
         //  do {
               while ( newProduct.equals("yes")) {
                   System.out.println("please enter the type of product recieved");
                   Scanner in = new Scanner(System.in);
                   String productType = in.next();
                   System.out.println("please enter the cost to us for each" +productType);
                   int cost = in.nextInt();
                   System.out.println("brand name");
                   String brandName = in.next();
                   System.out.println("please enter the number of " + productType + "in the shipment");
                   int numProductInShipment = in.nextInt();
                   int totalCostOfShipment = cost = numProductInShipment / 10;
                   System.out.println("shipment summary:\n" +
                           "The new product is " +productType + ".\n" +
                           "This shipment included " +numProductInShipment + "from"
                           + brandName + ".\n" + "The total value of the shipment was $" + totalCostOfShipment + ".\n");
                   System.out.println("With GST " +totalCostOfShipment * 1.05);

                   System.out.println("do you want to enter another product?");
                   newProduct = in.next();
                   // entryCondition = in.nextInt();}

                   /////////////////////////////////////////////

//            int smallest= 0;
//            int large= 0;
//            int num;
//
//    System.out.println("enter the number");
                   //     Scanner in = new Scanner(System.in);
//        String n = in.next();
//        num = in.nextInt();
//        smallest = num;
//        for (int i = 2; i < n; i++) {
//            num = in.nextInt();
//            if (num > large) {
//                large = num;
//            }
//            if (num < smallest) {
//                smallest = num;
//            }
//
//            }
//        System.out.println("the largest is:" + large);
//        System.out.println("the smallest is:" + smallest);
//        }
                   //   String firstNumber = in.next();
                   //     System.out.println("2nd number");
                   //   int two = in.nextInt();
//        int x, y, z;
//        System.out.println("enter three numbers");
//        Scanner in = new Scanner(System.in); //bugged upon entering numbers

                   ///////////////////////////////////////////////
//
//        x = in.nextInt();
//        y = in.nextInt();
//        z = in.nextInt();
//        if (x > y && x > z)
//            System.out.println("First number is largest");
//        else if (y > x && y > z)
//            System.out.println("Second number is largest");
//        else if (z > x && z > y)
//            System.out.println("Third number is largest");
//        else
//            System.out.println("entered numbers are the same");


                   ////////////////////////////////////////////

//        System.out.println("enter money amount");
//        Scanner in = new Scanner(System.in);
//        int cad = in.nextInt();
//        System.out.println(  cad * 0.75  ); //how do i output text here??


                   ///////////////////////////////////////////////

//        int n = 69;
//        double a = 669;
//        char c = 5 ;
//        System.out.println(n);
//        System.out.println(a);
//        System.out.println(c);
//        System.out.println(n + a);
//        System.out.println(a - n);


                   /////////////////////////////////////////////////////

//        int b = 69;
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the number you want to check");
//        b = in.nextInt();
//        if (b > 0)
//        System.out.println("the number" + b + "is positive");
//        else if (b < 0)
//        System.out.println("the given number" + b + "is negative");


                   /////////////////////////////////////////
//
//        System.out.println("please enter your name and grades");
//        Scanner in = new Scanner(System.in);
//                String mat = in.next() ;
//                System.out.println( "welcome " + mat+ " to the class");
//                System.out.println("the average of the class is 6");
//                int cal1 = in.nextInt();
//                int cal2 = in.nextInt();
//                int cal3 = in.nextInt();
//                int cal4 = in.nextInt();
//                int cal5 = in.nextInt();
//                int average = (cal1 + cal2 + cal3 + cal4 +cal5) / 5;
//            if ( average > 6 )
//            System.out.println("approved");
//            else if ( average < 6 )
//            System.out.println("not approved");


                   ////////////////////////////////

//System.out.println("please enter your salary");
//Scanner in = new Scanner(System.in);
//int salary = in.nextInt();
//if ( salary < 1000 )
//    System.out.println( salary * 1.15);
//else if ( salary > 1000 )
//    System.out.println( salary * 1.12);
//else if ( salary == 1000 )
//    System.out.println( salary );

                   ///////////////////////////////////////////

//        System.out.println("enter and integer");
//        Scanner in = new Scanner(System.in);
//        int new = in.next();












                   // }
//
//}

               }
           } //while (newProduct == "");
    }


