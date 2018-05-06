import java.util.Scanner;

public class TestException {

    public static void main(String... args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integar");
        int i = scan.nextInt();
        int j = scan.nextInt();

        try {
            int result = division(i , j);
            System.out.print("I / j is " +i / j );
        }
        catch(ArithmeticException e){

            System.out.println("Cannot possible");
        }
        System.out.println("Programm Continues");
        String k = scan.nextLine();
        System.out.println("Enter 2 More integars");
        int a = scan.nextInt();
        int b = scan.nextInt();

        int c = a / b;
        System.out.println("a/b is"+c--);

    }

    public static int division(int i , int j){

        if (j == 0)
            new ArithmeticException("Divisor cannot be zero");

        return i/j;

    }







}
