public class Policy
{
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   public Policy()
   {
       policyNumber = 1;
       providerName = "";
       holderFirstName = "";
       holderLastName = "";
       holderAge = 1;
       smokingStatus = "";
       holderHeight = 1.0;
       holderWeight = 1.0;
   }

   public Policy(int num, String provider, String first, String last, int age, String status, double height, double weight)
   {
      policyNumber = num;
      providerName = provider;
      holderFirstName = first;
      holderLastName = last;
      holderAge = age;
      smokingStatus = status;
      holderHeight = height;
      holderWeight = weight;
   }
   
   public void setPolicyNumber(int num)
   {
      policyNumber = num;
   }
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
   public void setFirstName(String first)
   {
      holderFirstName = first;
   }
   
   public void setLastName(String last)
   {
      holderLastName = last;
   }
   
   public void setAge(int age)
   {
      holderAge = age;
   }
   
   public void setStatus(String status)
   {
      smokingStatus = status;
   }
   
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return holderFirstName;
   }
   
   public String getLastName()
   {
      return holderLastName;
   }
   
   public int getAge()
   {
      return holderAge;
   }
   
   public String getStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return holderHeight;
   }
   
   public double getWeight()
   {
      return holderWeight;
   }
   
   
   public double getBMI()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
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
      