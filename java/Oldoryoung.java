import java.util.Scanner;

class young extends Exception {
    young(String msg) {
        System.out.println(msg);
    }
}

class old extends Exception {
    old(String msg) {
        System.out.println(msg);
    }
}

public class Oldoryoung {
    public static void main(String[] args) {
        System.out.print("Enter age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 60) {
            try {
                throw new old("You are too old");
            } catch (Exception e) {
                System.out.println("Old error:" + e);
            }
        } else if (age < 18) {
            try {
                throw new young("You are young");
            } catch (Exception e) {
                System.out.println("Young errr:" + e);
            }
        } else {
            System.out.println("OK");

        }
    }
}
