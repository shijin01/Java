import java.util.Scanner;
class negative extends Exception {
    negative(String msg) {
        System.out.println(msg);
    }
}
public class averageofpositive {
    public static void main(String[] args) {
        int n, i,s=0;
        float avg;
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element:");
        n = sc.nextInt();
        System.out.print("Enter elements:");
        for (i = 0; i < n; ++i) {
            try {
                arr[i] = sc.nextInt();
                if (arr[i] < 0) {
                    throw new negative("Donot enter negative number!");

                } else {
                    s += arr[i];
                }
            } catch (Exception e) {
                System.out.println("Enter another element");
                --i;
            }

        }
        System.out.println("Average:"+s*1.0/n);     
    }
}
