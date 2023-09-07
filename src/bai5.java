import java.sql.SQLOutput;
import java.util.Scanner;

public class bai5 {
    public static void main(String[] args){
        double a,b,c, delta,x1, x2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a = ");
         a = sc.nextDouble();
        System.out.println("Nhập vào hệ số b = ");
         b = sc.nextDouble();
        System.out.println("Nhập vào hệ số c = ");
         c = sc.nextDouble();
        System.out.println("Phương trình bậc 2 có dạng: " + a + "(x^2) + "  + b +"(x) + " + c + "=0");
        delta = Math.pow(b,2)-4*a*c;
        System.out.println("Delta của phương trình bậc 2 là: " + delta);

        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta == 0) {
            x1 = -b / 2*a;
            System.out.println("Phương trình có nghiệm kép là: x1 = x2 = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("Phương trình có hai nghiệm phân biệt: x1 và x2");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }
}
