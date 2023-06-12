import java.util.*;
import java.io.*;

public class Project_Shalena_Mumford
{
   public static void main(String[] args) throws IOException
   {
      // int policyNumber;
//       String providerName;
//       String holderFirstName;
//       String holderLastName;
//       int holderAge;
//       String smokingStatus;
//       double holderHeight;
//       double holderWeight;
      
      Scanner keyboard = new Scanner(System.in);
      
      ArrayList<Policy> policyInfo = new ArrayList<>();
      
      File userInfo = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(userInfo);
      
      while (inputFile.hasNext())
      {
         int policyNumber = inputFile.nextInt();
      
         keyboard.nextLine();
         
         String providerName = inputFile.nextLine();
      
         String holderFirstName = inputFile.nextLine();
         
         String holderLastName = inputFile.nextLine();
         
         int holderAge = inputFile.nextInt();
      
         keyboard.nextLine();
         
         String smokingStatus = inputFile.nextLine();
            
         double holderHeight = inputFile.nextDouble();
      
         double holderWeight = inputFile.nextDouble();
         
         policyInfo.add(new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight));    
      }
      
      
      // Policy PolicyPrice = new Policy(policyNumber, providerName, holderFirstName, holderLastName, holderAge, smokingStatus, holderHeight, holderWeight);
//       
//       System.out.println();
//       System.out.println("Policy Number: " + PolicyPrice.getPolicyNumber());
//       System.out.println("Provider Name: " + PolicyPrice.getProviderName());
//       System.out.println("Policyholder's First Name: " + PolicyPrice.getFirstName());
//       System.out.println("Policyholder's Last Name: " + PolicyPrice.getLastName());
//       System.out.println("Policyholder's Age: " + PolicyPrice.getAge());
//       System.out.println("Policyholder's Smoking Status: " + PolicyPrice.getStatus());
//       System.out.printf("Policyholder's Height: %.1f\n", PolicyPrice.getHeight());
//       System.out.printf("Policyholder's Weight: %.1f\n", PolicyPrice.getWeight());
//       System.out.printf("Policyholder's BMI: %.2f\n", PolicyPrice.getBMI());
//       System.out.printf("Policy Price $%.2f\n", PolicyPrice.getInsurancePrice());
    }
}