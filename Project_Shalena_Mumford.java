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
      int objectCount;
       
      Scanner keyboard = new Scanner(System.in);
      
      ArrayList<Policy> policyInfo = new ArrayList<>();
      ArrayList<String> smokers = new ArrayList<>();
      Policy object = new Policy();
            
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
         
         PolicyHolder holderInfo = new PolicyHolder(holderFirstName, holderLastName, age, smokingStatus, height, weight);
         Policy information = new Policy(num, providerName, holderInfo);
         policyInfo.add(new Policy(num, providerName, holderInfo));
      }
      
      objectCount = object.getInstanceCount();
      
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
            System.out.println(policyInfo.get(index).toString());
         }
    
    System.out.println();
    System.out.println("There were " + objectCount + " Policy objects created.");
    System.out.println("The number of policies with a smoker is : " + count);
    System.out.println("The number of policies with a non-smoker is : " + non);
    
     
    }
}