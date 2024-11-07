import java.util.Scanner;

public class IT24104001Lab3Q4 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
        
        
        int num1 = number / 10000;
        int num2 = (number / 1000) % 10;
        int num3 = (number / 100) % 10;
        int num4 = (number / 10) % 10;
        int num5 = number % 10;
        
      
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        
       
    }
}