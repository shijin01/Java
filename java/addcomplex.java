import java.util.Scanner;

public class addcomplex {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter complex number1:");
        System.out.print("real part:");
        a = sc.nextInt();
        System.out.print("imaginary part:");
        b = sc.nextInt();
        complex c1 = new complex(a, b);
        System.out.println("Enter complex number2:");
        System.out.print("real part:");
        a = sc.nextInt();
        System.out.print("imaginary part:");
        b = sc.nextInt();
        complex c2 = new complex(a, b);
        complex c3 = new complex();
        c3.sumcomplex(c1, c2);
        System.out.println("Sum Complex:" + c3.printcomplex());

    }
}

class complex {
    int i, j;

    complex() {
    };

    complex(int a, int b) {
        i = a;
        j = b;
    }

    void sumcomplex(complex ob1, complex ob2) {
        i = ob1.i + ob2.i;
        j = ob1.j + ob2.j;
    }

    String printcomplex() {
        String s;
        if (j > -1) {
            s = String.format("%d+%di", i, j);

        } else
            s = String.format("%d-%di", i, -j);
        return s;
    }
}