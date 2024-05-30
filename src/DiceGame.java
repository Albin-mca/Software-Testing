import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur number:");
        int num=sc.nextInt();

        if(num>5){
            System.out.println("u Won the Game");
        }
        else{
            System.out.println("u Lose the Game");

        }
    }
}
