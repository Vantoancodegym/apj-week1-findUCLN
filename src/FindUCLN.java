import java.util.Scanner;

public class FindUCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        if (a*b==0){
            System.out.println("No greatest common factor");
        }else {
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
            System.out.println("Greatest common factor: " + a);
        }

    }
}
