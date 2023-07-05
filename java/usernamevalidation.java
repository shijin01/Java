import java.util.Scanner;
class validateError extends Exception {
    validateError(String valString) {
        System.out.println(valString);
    }
}
public class usernamevalidation {
    public static void main(String[] args) {
        String username = "exam1";
        String password = "exam@123";
        System.out.print("Enter username:");
        Scanner sc = new Scanner(System.in);
        String usernm = sc.nextLine();
        System.out.print("Enter password:");
        String pswd = sc.nextLine();
        sc.close();
        try {
            if (!username.equals(usernm)) {
                throw new validateError("Invalid Username");
            }
            if (!password.equals(pswd)) {
                throw new validateError("Invalid Password");
            } else {
                System.out.println("Validation successful");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
