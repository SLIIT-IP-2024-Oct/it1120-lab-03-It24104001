import java.util.Scanner;

public class IT24104001Lab3Q2 {

    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the monthly salary: ");
        double MonthlySalary = input.nextDouble();
        
        System.out.print("Enter the number of OT hours: ");
        double OTHours = input.nextDouble();
        
        System.out.print("Enter the OT hourly rate: ");
        double OTHourlyRate = input.nextDouble();
        
        double OTAmount = OTHours * OTHourlyRate;
        double TotalSalary = MonthlySalary + OTAmount;
        
    
        System.out.println("The total salary is: " + TotalSalary);
        
    }
}