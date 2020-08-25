import java.util.Scanner;

public class smallestAndLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*  GOAL//Program window should look like this post-completion:

        Test Data
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87

        The smallest number: 25
        The largest number: 87                                          */


        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();

            //If #1 is the smallest number
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest: " + num1);
        } else if (num2 < num1 && num2 < num3){
            System.out.println("The smallest: " + num2);
        } else {
            System.out.println("The smalles: " + num3);
        }


            //If #1 is the largest number
        if (num1 > num2 && num1 > num3) {
                System.out.println("The greatest: " + num1);
            //If #2 is the largest number
        } else if (num2 > num1 && num2 > num3) {
                System.out.println("The greatest: " + num2);
            //If #3 is the largest number
        } else {
            System.out.println("The greatest: " + num3);
        }
    }
}
