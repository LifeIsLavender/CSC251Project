import java.util.*;
import java.io.*;

public class Project_Shalena_Mumford
{
   public static void main(String[] args) throws IOException
   {
      String policyNumber;
      String providerName;
      String holderFirstName;
      String holderLastName;
      String holderAge;
      String smokingStatus;
      String holderHeight;
      String holderWeight;
      int num;
      int age;
      double height;
      double weight;
       
      Scanner keyboard = new Scanner(System.in);
      
      ArrayList<Policy> policyInfo = new ArrayList<>();
      ArrayList<String> smokers = new ArrayList<>();
      
      File userInfo = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(userInfo);
      
      while (inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine();
         
         providerName = inputFile.nextLine();
      
         holderFirstName = inputFile.nextLine();
         
         holderLastName = inputFile.nextLine();
         
         holderAge = inputFile.nextLine();
         
         smokingStatus = inputFile.nextLine();
            
         holderHeight = inputFile.nextLine();
      
         holderWeight = inputFile.nextLine();
         
         if (inputFile.hasNext())
         {
            String space = inputFile.nextLine();
         }
         
         num = Integer.parseInt(policyNumber);
         age = Integer.parseInt(holderAge);
         height = Double.parseDouble(holderHeight);
         weight = Double.parseDouble(holderWeight);
         
         smokers.add(smokingStatus);
         policyInfo.add(new Policy(num, providerName, holderFirstName, holderLastName, age, smokingStatus, height, weight));
      }
      
      inputFile.close();
      
      int count = 0;
      
      for (int index = 0; index < smokers.size(); index++)
         {
            if (smokers.get(index).equals("smoker"))
               count++;
         }
         
      int non = smokers.size() - count;
         
      for (int index = 0; index < policyInfo.size(); index++)
         {
            System.out.println();
            System.out.println("Policy Number: " + policyInfo.get(index).getPolicyNumber());
            System.out.println("Provider Name: " + policyInfo.get(index).getProviderName());
            System.out.println("Policyholder's First Name: " + policyInfo.get(index).getFirstName());
            System.out.println("Policyholder's Last Name: " + policyInfo.get(index).getLastName());
            System.out.println("Policyholder's Age: " + policyInfo.get(index).getAge());
            System.out.println("Policyholder's Smoking Status: " + policyInfo.get(index).getStatus());
            System.out.printf("Policyholder's Height: %.1f\n", policyInfo.get(index).getHeight());
            System.out.printf("Policyholder's Weight: %.1f\n", policyInfo.get(index).getWeight());
            System.out.printf("Policyholder's BMI: %.2f\n", policyInfo.get(index).getBMI());
            System.out.printf("Policy Price $%.2f\n", policyInfo.get(index).getInsurancePrice());
    }
    
    System.out.println();
    System.out.println("The number of policies with a smoker is : " + count);
    System.out.println("The number of policies with a non-smoker is : " + non);
    
     
    }
}