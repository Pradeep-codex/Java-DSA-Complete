package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("Enter an integer: ");
        int num2 = input.nextInt();
        System.out.println("Num 1 = "+num);
        System.out.println("Num 2 = "+num2);
        System.out.println("Enter your name: ");
        String name = input.next();
        input.nextLine();
        System.out.println("Enter your address: ");
        String add = input.nextLine();
        System.out.println("My name is: "+name);
        System.out.println("My address is: "+add);
    }
}
