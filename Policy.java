public class Policy
{
   //instance fields
   private int policyNum, holderAge;
   private String providerName, holderFirstName, holderLastName, smokingStatus;
   private double holderHeight, holderWeight;
   
   //no arg constructor
   public Policy()
   {
      policyNum = 0; 
      holderAge = 0;
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      smokingStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   //basic arg constructors
   public Policy(int a)
   {
      holderAge = a;
   }
   
   public Policy(String a)
   {
      smokingStatus = a;
   }
   
   public Policy(double a, double b)
   {
      holderHeight = a;
      holderWeight = b;
   }
   
   //all arg constructor
   public Policy(int a, int b, String c, String d, String e, String f, double g, double h)
   {
      policyNum = a; 
      holderAge = b;
      providerName = c;
      holderFirstName = d;
      holderLastName = e;
      smokingStatus = f;
      holderHeight = g;
      holderWeight = h;
   }
   
   //setter and return methods for policy number
   public void setPolicyNum(int a)
   {
      policyNum = a;
   }
   
   public int returnPolicyNum()
   {
      return policyNum;
   }
   
   //setter and return methods for policy holders age
   public void setHolderAge(int a)
   {
      holderAge = a;
   }
   
   public int returnHolderAge()
   {
      return holderAge;
   }
   
   //setter and return methods for insurance providers name
    public void setProviderName(String a)
   {
      providerName = a;
   }
   
   public String returnProviderName()
   {
      return providerName;
   }
   
    //setter and return methods for policy holders first name
   public void setHolderFirstName(String a)
   {
      holderFirstName = a;
   }
   
   public String returnHolderFirstName()
   {
      return holderFirstName;
   }
   
   //setter and return methods for policy holders last name
   public void setHolderLastName(String a)
   {
      holderLastName = a;
   }
   
   public String returnHolderLastName()
   {
      return holderLastName;
   }
   
   //setter and return methods for policy holders smoking status
   public void setSmokingStatus(String a)
   {
      smokingStatus = a;
   }
   
   public String returnSmokingStatus()
   {
      return smokingStatus;
   }
   
   //setter and return methods for policy holders height
   public void setHolderHeight(double a)
   {
      holderHeight = a;
   }
   
   public double returnHolderHeight()
   {
      return holderHeight;
   }
   
   //setter and return methods for policy holders weight
   public void setHolderWeight(double a)
   {
      holderWeight = a;
   }
   
   public double returnHolderWeight()
   {
      return holderWeight;
   }
   
   public double calculateBMI()
   {
      double BMI = (holderWeight * 703) / (holderHeight * holderHeight);
      return BMI;
   }
   
   public double calculateCost()
   {
      double totalCost = 600;
      double BMI = calculateBMI();
      
      if(holderAge > 50)
      {
         totalCost += 75;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         totalCost += 100;
      }
      
      if(BMI > 35)
      {
         totalCost += (BMI - 35) * 20;
      }
      
      return totalCost;
   }
   
}