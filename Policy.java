/**
   Policy Class for the project
*/

public class Policy
{
   private int policyNumber;
   private String providerName;

   
/** 
   Constructor initializing all values
*/
   
   public Policy()
   {
       policyNumber = 1;
       providerName = "";
   }
   
/**
   Consructor
   @param num equals policy number
   @param provider equals policy provider
*/

   public Policy(int num, String provider)
   {
      policyNumber = num;
      providerName = provider;
   }
   
/**
   The setPolicyNumber method sets the user's policy number
   @param num equals policy number
*/
   
   public void setPolicyNumber(int num)
   {
      policyNumber = num;
   }
   
/**
   The setProviderName method sets the user's provider
   @param provider equals policy provider
*/
   
   public void setProviderName(String provider)
   {
      providerName = provider;
   }
   
/**
   getPolicy method
   @ return the user's policy number
*/

   public int getPolicyNumber()
   {
      return policyNumber;
   }
   
/**
   getProviderName method
   @ return the user's provider name
*/
   
   public String getProviderName()
   {
      return providerName;
   }

/**
   toString method
   @ return prints the insurance data
*/
   
   public String toString()
   {
      String str = "Policy Number: " + this.getPolicyNumber() +
                   "\nProvider Name: " + this.getProviderName();
      
      return str;
   }
}
      