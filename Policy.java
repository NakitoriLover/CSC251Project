public class Policy
{
   //instance fields
   private int policyNum;
   private String providerName;
   private PolicyHolder holder;
   private static int policyCount = 0;
   
   /**
      no argument constructor
   */
   public Policy()
   {
      this.policyCount++;
   }
   
   /**
      all arg constructor
      @param policyNum holds the policyNum int
      @param providerName holds providerName String
      @param holder holds the PolicyHolder class
      
   */
   public Policy(int policyNum, String providerName, PolicyHolder holder)
   {
      this.policyNum =  policyNum; 
      this.providerName = providerName;
      this.holder = new PolicyHolder(holder);
      this.policyCount++;
      
   }

   //setter methods
     
   /**
      This method sets the policy number
      @param policyNum Policy number integer inputted by user
   */
   public void setPolicyNum(int policyNum)
   {
      this.policyNum = policyNum;
   }
   
   /**
      This method sets the name of the provider
      @param providerName Provider name is stored as a String
   */
    public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   //getter methods
   
   /**
      This method returns the Provider Name
      @return providerName Provider Name String that was previous set
   */
   public String getProviderName()
   {
      return providerName;
   } 
   
   /**
      This method returns the policy number
      @return policyNum Policy Number that was previously set
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /**
      This method returns the holder variable
      @return new PolicyHolder(holder) returns the PolicyHolder variable as copy
   */
   public PolicyHolder getHolder()
   {
      return new PolicyHolder(holder);
   }
   
   /**
      This method returns the policyCount variable
      @return policyCount returns the policyCount int
   */
   public static int getPolicyCount()
   {
      return policyCount;
   }
   
   //other methods
   
   /**
      This method uses several methods and variables to calculate the overall cost
      @return totalCost The result of the cost calculations utilizing various methods and variables
   */
   public double calculateCost()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double totalCost = BASE_PRICE;
      double BMI = holder.calculateBMI();
      
      if(holder.getAge() > AGE_THRESHOLD)
      {
         totalCost += ADDITIONAL_FEE_AGE;
      }
      
      if(holder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         totalCost += ADDITIONAL_FEE_SMOKING;
      }
      
      if(BMI > BMI_THRESHOLD)
      {
         totalCost += (BMI - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI;
      }
      
      return totalCost;
   }
   
   /**
      method creates a ToString method
      @return str output of the ToString method
   */
   public String toString()
   {
      return "Policy Number: " + policyNum +
       "\nProvider Name: " + providerName +
       "\n" + holder.toString() +
       "\n" + String.format("Policy Price: $%.2f", calculateCost());
   }
   
}