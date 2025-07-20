package basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        float n = sc.nextFloat();
        System.out.println("FLoat Vlaue:"+n);

        try{
            System.out.println("Trying store Float value in Int Data type");
            System.out.println("Enter a float value");
            int i = sc.nextInt();
            System.out.println(i);
        }
        catch(Exception e){
            System.out.println("Float Value Cannot Store in Int Data type");
        }
    }
}
