import java.util.Scanner;
public class calculator {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter b number");
        int b=sc.nextInt();
        int operator =sc.nextInt();
        switch(operator){
            case 1:System.out.println(a+b);
            break;
            case 2:System.out.println(a-b);
            break;
            case 3:System.out.println(a*b);
            break;
            case 4:System.out.println(a/b);
            break;
            case 5:System.out.println(a%b);
            break;
            default:System.out.println("Enetr the valid operator or FUCK OFF \n ");

        }

        }    
}
