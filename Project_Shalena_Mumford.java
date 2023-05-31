import java.util.Scanner;

public class Project_Shalena_Mumford
{
   public static void main(String[] args)
   {
      int policyNumber;
      String providerName;
      String holderFirstName;
      String holderLastName;
      int holderAge;
      String smokingStatus;
      double holderHeight;
      double holderWeight;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the Policy Number.");
      policyNumber = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.println("Please enter the Provider Name.");
      providerName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's First Name.");
      holderFirstName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Last Name.");
      holderLastName = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Age.");
      holderAge = keyboard.nextInt();
      
      keyboard.nextLine();
            
      System.out.println("Please enter the Policyholder's Smoking Status. (smoker/non-smoker)");
      smokingStatus = keyboard.nextLine();
      
      System.out.println("Please enter the Policyholder's Height (in inches).");
      holderHeight = keyboard.nextDouble();
      
      System.out.println("Please enter the Policyholder's Weight (in pounds).");
      holderWeight = keyboard.nextDouble();
      
      System.out.println("Main says: " + smokingStatus);
      
      Policy PolicyPrice = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
      
      System.out.println();
      System.out.println("Policy Number: " + PolicyPrice.getPolicyNumber());
      System.out.println("Provider Name: " + PolicyPrice.getProviderName());
      System.out.println("Policyholder's First Name: " + PolicyPrice.getFirstName());
      System.out.println("Policyholder's Last Name: " + PolicyPrice.getLastName());
      System.out.println("Policyholder's Age: " + PolicyPrice.getAge());
      System.out.println("Policyholder's Smoking Status: " + PolicyPrice.getStatus());
      System.out.printf("Policyholder's Height: %.1f\n", PolicyPrice.getHeight());
      System.out.printf("Policyholder's Weight: %.1f\n", PolicyPrice.getWeight());
      System.out.printf("Policyholder's BMI: %.2f\n", PolicyPrice.getBMI());
      System.out.printf("Policy Price $%.2f\n", PolicyPrice.getInsurancePrice());
   }
}