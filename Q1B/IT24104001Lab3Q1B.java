import java.util.Scanner;

public class IT24104001Lab3Q1B { 
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the price of 1kg of rice: ");
        double PricePerKg = input.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double NumberofKgs = input.nextDouble();
        
        double TotalAmount = PricePerKg * NumberofKgs;
        double Discount = TotalAmount * 0.10;
        double FinalAmount = TotalAmount - Discount; 
        System.out.println("The total amount after 10% discount is: " + FinalAmount);
        
    }
}