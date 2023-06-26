/**
   Policy Class for the project
*/

public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;

/** 
   Constructor initializing all values
*/
   
   public PolicyHolder()
   {
      holderFirstName = "";
      holderLastName = "";
      holderAge = 1;
      smokingStatus = "";
      holderHeight = 1.0;
      holderWeight = 1.0;
   }
   
/**
   Consructor
   @param first equals policy holder's first name
   @param last equals policy holder's last name
   @param age equals policy holder's age
   @param status equals policy holder's smoking status
   @param height equals policy holder's height
   @param weight equals policy holder's weight
*/
   
   public Policy(String first, String last, int age, String status, double height, double weight)
   {
      holderFirstName = first;
      holderLastName = last;
      holderAge = age;
      smokingStatus = status;
      holderHeight = height;
      holderWeight = weight;
   }
 
/**
   The setFirstName method sets the user's first name
   @param first equals policy holder's first name
*/
  
   public void setFirstName(String first)
   {
      holderFirstName = first;
   }
   
/**
   The setLastName method sets the user's last name
   @param last equals policy holder's last name
*/
   
   public void setLastName(String last)
   {
      holderLastName = last;
   }
   
/**
   The setAge method sets the user's age
   @param age equals policy holder's age
*/
   
   public void setAge(int age)
   {
      holderAge = age;
   }
   
/**
   The setStatus method sets the user's smoking status
   @param status equals policy holder's smoking status
*/
   
   public void setStatus(String status)
   {
      smokingStatus = status;
   }
   
/**
   The setHeight method sets the user's height
   @param height equals policy holder's height
*/
   
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
/**
   The setWeight method sets the user's height
   @param weight equals policy holder's weight
*/
   
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
/**
   getFirstName method
   @ return the user's first name
*/
   
   public String getFirstName()
   {
      return holderFirstName;
   }
   
/**
   getLastName method
   @ return the user's last name
*/
   
   public String getLastName()
   {
      return holderLastName;
   }
   
/**
   getAge method
   @ return the user's age
*/
   
   public int getAge()
   {
      return holderAge;
   }
   
/**
   getStatus method
   @ return the user's smoking status
*/
   
   public String getStatus()
   {
      return smokingStatus;
   }
   
/**
   getHeight method
   @ return the user's height
*/
   
   public double getHeight()
   {
      return holderHeight;
   }
   
/**
   getWeight method
   @ return the user's weight
*/
   
   public double getWeight()
   {
      return holderWeight;
   }
   
/**
   getBMI method
   @ return calculates the user's BMI based on weight & height
*/ 
   
   public double getBMI()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
/**
   getInsurancePrice method
   @ return calculates the user's insurance price based on BMI, age, and smoking status
*/ 
   
   public double getInsurancePrice()
   {
      double totalPrice = 600;
      double BMI = getBMI();

         if (holderAge > 50)
            totalPrice += 75;
         if (smokingStatus.equals("smoker"))
            totalPrice += 100;
         if (BMI > 35)
            totalPrice += ((BMI - 35) * 20);
         
      return totalPrice;
   }
}