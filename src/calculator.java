import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        AddNumber(2,2);
//        AddNumber(2,3);

        int s= AddNumber(2,4);
        System.out.println("S = " + s);


        System.out.println("Enter 1st No: ");
        int num1=sc.nextInt();
        System.out.println("Enter 2nd No: ");
        int num2= sc.nextInt();

        int add=num1+num2;
        System.out.println("Addtion :" +add);

//        int mul=num1*num2;
//        System.out.println("Multiplication :" +mul);
//
//        int sub=num1-num2;
//        System.out.println("Subtration :" +sub);

    }

    public static int AddNumber(int num1,int num2){
        int add=num1+num2;
        System.out.println("Addtion :" +add);

        int mul=num1*num2;
        System.out.println("Mulitiplication :" +mul);
        return (add);

    }
}
