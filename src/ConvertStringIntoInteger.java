import java.util.Scanner;

public class ConvertStringIntoInteger {
    String i;
    ConvertStringIntoInteger(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number in th form of string ");
        i=sc.nextLine();
        int res=Integer.parseInt(i);
        System.out.println(res);
    }

    public static void main(String[] args) {
        ConvertStringIntoInteger obj=new ConvertStringIntoInteger();

    }
}
