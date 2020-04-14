import java.util.Scanner;
public class IfElseEdit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input a number to be tested:\n>");
        int number = scn.nextInt();

        if (number > 10) {
            System.out.println(number+">"+10);
        }
        else if (number < 10) {
            System.out.println(number+"<"+10);
        }
        else {
            System.out.println(number+"="+10);
        }
        System.out.println("Application finished.");
}
}
