import java.util.Scanner;

public class IT24104001Lab3Q1A { 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double PricePerKg = input.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double NumberofKgs = input.nextDouble();
        
        double TotalAmount = PricePerKg * NumberofKgs;
        
        System.out.println("The total amount is: " + TotalAmount);
        
        
    }
}