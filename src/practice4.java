import java.util.Arrays;
import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
//        System.out.println("would you like to use the program");
//
//        Scanner out = new Scanner(System.in);
//        String exito = out.next();
//        if (exito.equals("yes")) {
//        Scanner in = new Scanner(System.in);
//        int number1 = 0;
//        int number2 = 0;
//        String operator;
//        String exit;
//
//
//        System.out.println(" enter the first number");
//        number1 = in.nextInt();
//        System.out.println("enter the second number");
//        number2 = in.nextInt();
//
//        Scanner op = new Scanner(System.in);
//
//        System.out.println("what operation");
//        operator = op.next();
//        exit = in.next();
//
//        if (operator.equals("+")) {
//            System.out.println("the answer is " + (number1 + number2));
//        }
//        if (operator.equals("-")) {
//            System.out.println("the answer is " + (number1 - number2));
//        }
//        if (operator.equals("*")) {
//            System.out.println("the answer is " + (number1 * number2));
//        }
//        if (operator.equals("/")) {
//            System.out.println("the answer is " + (number1 / number2));
//        }
//
//        }
//    }

        //////////////////////////////////////////

        int[] salary = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("please enter 5 salaries");
        salary[0] = in.nextInt();
        salary[1] = in.nextInt();
        salary[2] = in.nextInt();
        salary[3] = in.nextInt();
        salary[4] = in.nextInt();

//            for ( int updated: salary) {
//                System.out.println(updated);
//            }

        for (int i = 1; i < salary.length; i++) {

            if (salary[0] <= 1000) {
                System.out.println(salary[0] * 1.15);
            } else {
                System.out.println(salary[0] * 1.12);
            }

            if (salary[1] <= 1000) {
                System.out.println(salary[1] * 1.15);
            } else {
                System.out.println(salary[1] * 1.12);
            }

            if (salary[2] <= 1000) {
                System.out.println(salary[2] * 1.15);
            } else {
                System.out.println(salary[2] * 1.12);
            }

            if (salary[3] <= 1000) {
                System.out.println(salary[3] * 1.15);
            } else {
                System.out.println(salary[3] * 1.12);
            }

            if (salary[4] <= 1000) {
                System.out.println(salary[4] * 1.12);
            } else {
                System.out.println(salary[4] * 1.12);
            }


        }
    }
}



        ////////////////////////////////////////////

//        String[] frstProduct = new String[10];  //this is longhand, shorthand would be String[] frstProduct = {"product", "your product", etc..}
//        frstProduct[0] = "good apples";
//        frstProduct[1] = "okay apples";
//        frstProduct[2] = "not good apples";
//        frstProduct[3] = "less not good apples";
//        frstProduct[4] = "kinda okay apples";
//        frstProduct[5] = "kinda bad apples";
//        frstProduct[6] = "bad apples";
//        frstProduct[7] = "really bad apples";
//        frstProduct[8] = "meh apples";
//        frstProduct[9] = "perfect apples";
//
//        int[] scndProduct = new int[10];
//        scndProduct[0] = 9 ;
//        scndProduct[1] = 8 ;
//        scndProduct[2] = 4 ;
//        scndProduct[3] = 6 ;
//        scndProduct[4] = 7 ;
//        scndProduct[5] = 3 ;
//        scndProduct[6] = 2 ;
//        scndProduct[7] = 1 ;
//        scndProduct[8] = 5 ;
//        scndProduct[9] = 10 ;
//
//        int[] thrdProduct = new int[10];
//
//        System.out.println("0." + frstProduct[0] + " $" + scndProduct[0]);
//        System.out.println("1." + frstProduct[1] + " $" + scndProduct[1]);
//        System.out.println("2." + frstProduct[2] + " $" + scndProduct[2]);
//        System.out.println("3." + frstProduct[3] + " $" + scndProduct[3]);
//        System.out.println("4." + frstProduct[4] + " $" + scndProduct[4]);
//        System.out.println("5." + frstProduct[5] + " $" + scndProduct[5]);
//        System.out.println("6." + frstProduct[6] + " $" + scndProduct[6]);
//        System.out.println("7." + frstProduct[7] + " $" + scndProduct[7]);
//        System.out.println("8." + frstProduct[8] + " $" + scndProduct[8]);
//        System.out.println("9." + frstProduct[9] + " $" + scndProduct[9]);
//
//        for (int i=0; i<frstProduct.length; i++) {
//       //     System.out.println("is %s; %s.2/f\n", i, frstProduct[i], scndProduct[i]);
//        }
//        Scanner in = new Scanner(System.in);
//        String answer;
//        do {
//            System.out.println("please enter the id of the product you would like to buy");
//            int id = in.nextInt();
//            System.out.println("how many would you like to purchase?");
//            int bought = in.nextInt();
//
//            System.out.println("would you like to continue shopping?");
//            answer = in.next();
//        } while (answer.equals("no"));
//
//        System.out.println("product \t %s \t number bought \t total \n");
//        float grandTotal = 0;

//        int[][] m1 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
//        int[][] m2 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
//        int[][] result = new int[3][3];
//        if (m1.length != m2.length) {
//            System.out.println("these arreys are not the same size, try again");
//        } else {
//                for (int i = 0; i< m1.length; i++) {
//                    result[i][i] = m1[i][i] + m2[i][i];
//                    System.out.println(result[i][i] + "");
//                }
//                }

//        public class car {
//            private String model;
//            private int year;
//            private String brand;
//            private int speed;








