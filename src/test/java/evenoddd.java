import java.util.Scanner;

public class evenoddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n = sc.nextInt();
        if(n%2==0) {
            System.out.println("Enter number is even");
        }else{
            System.out.println("Enter number is odd");
        }

    }
}
