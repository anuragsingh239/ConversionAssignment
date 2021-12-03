import java.util.Scanner;

public class ConvertIntToHexAndOctal {
    int i;
    String b,o,h;
    ConvertIntToHexAndOctal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer number ");
        i=sc.nextInt();
    }
    void display(){
        b=Integer.toBinaryString(i);
        o=Integer.toOctalString(i);
        h=Integer.toHexString(i);
        System.out.println("java test  "+i);
        System.out.println("given number  "+i);
        System.out.println("Binary eqivalent  "+b);
        System.out.println("Octal eqivalent  "+o);
        System.out.println("Hex eqivalent  "+h);

    }

    public static void main(String[] args) {
        ConvertIntToHexAndOctal obj=new ConvertIntToHexAndOctal();
        obj.display();
    }
}
