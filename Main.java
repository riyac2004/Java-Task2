import java.net.StandardSocketOptions;
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num=sc.nextInt();
        System.out.print("Enter a floating point integer: ");
        float fnum=sc.nextFloat();
        System.out.print("Enter a double integer: ");
        double dnum=sc.nextDouble();
        System.out.print("Enter a string: ");
        String st=sc.next();
        System.out.print("Enter a character: ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter a boolean value: ");
        boolean bval=sc.nextBoolean();

        System.out.println("Integer: " +num);
        System.out.println("Floating point integer: " +fnum);
        System.out.println("Double: " +dnum);
        System.out.println("String: " +st);
        System.out.println("Character: " +ch);
        System.out.println("Boolean: " +bval);

        //Arithmetic Operations
        System.out.println("Arithmetic Operations ");
        //Addition of Two numbers
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        System.out.print("Choose operator (+,-,/,* ): ");
        char op=sc.next().charAt(0);

        if(op=='+'){
            System.out.println(a+ " + " +b+ " = " +(a+b));
        }
        else if(op=='-'){
            System.out.println(a+" - " +b+ " = " +(a-b));
        }
        else if(op=='*'){
            System.out.println(a+ " * " +b+ " = " +(a*b));
        }
        else if (op =='/') {
            System.out.println(a + " / " +b+ " = " + ((double) a / b));
        }
        else if(op=='%'){
            System.out.println(a+ " % " +b+ " = " +(a%b));
        }
        else{
            System.out.println("Invalid character choosen");
        }
    }
}