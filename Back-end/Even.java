import java.util.Scanner;

public class Even{
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);//Scanner s aobjec

        System.out.print("Enter a number: ");// Scanner s method
        int num = reader.nextInt();

        if(num%2 == 0){//cheack the condition
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
