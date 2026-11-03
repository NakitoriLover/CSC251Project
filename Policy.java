public class Policy
{
   //instance fields
   private int policyNum;
   private String providerName;
   private PolicyHolder holder;
   
   //no argument constructor has been removed
   
   //all arg constructor
   public Policy(int  policyNum, String providerName, PolicyHolder holder)
   {
      this.policyNum =  policyNum; 
      this.providerName = providerName;
      this.holder = new PolicyHolder(holder);
      
   }

   //setter methods
     
   /*
      This method sets the policy number
      @param policyNum Policy number integer inputted by user
   */
   public void setPolicyNum(int policyNum)
   {
      this.policyNum = policyNum;
   }
   
   /*
      This method sets the name of the provider
      @param providerName Provider name is stored as a String
   */
    public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   //getter methods
   
   /*
      This method returns the Provider Name
      @return providerName Provider Name String that was previous set
   */
   public String getProviderName()
   {
      return providerName;
   } 
   
   /*
      This method returns the policy number
      @return policyNum Policy Number that was previously set
   */
   public int getPolicyNum()
   {
      return policyNum;
   }
   
   /*
      This method returns the holder variable
      @return new PolicyHolder(holder) returns the PolicyHolder variable as copy
   */
   public PolicyHolder getHolder()
   {
      return new PolicyHolder(holder);
   }
   
    /*
      This method uses the holder's height and weight to calculate BMI
      @return BMI The result of the BMI calculations utilizing the holder's height and weight
   */
   public double calculateBMI()
   {
      final double CONVFACTOR = 703;
      
      double BMI = (holder.getWeight() * CONVFACTOR) / (holder.getHeight() * holder.getHeight());
      return BMI;
   }
   
   /*
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
      double BMI = calculateBMI();
      
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
   
   /*
      This method uses all previous variables and methods to display information about the cost and policy.
   */
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNum);
      System.out.println("Provider Name: " + providerName);

      System.out.printf("Policyholder's BMI: %.2f\n", calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", calculateCost());
   }
   
   /*
      method creates a ToString method
      @return str output of the ToString method
   */
   public String ToString()
   {
      String str = "Policy Number: " + policyNum +
                   "\nProvider Name: " + providerName +
                   holder.ToString() +
                   "\nPolicyholder's BMI: " + calculateBMI() +
                   "\nPolicy Price: " + calculateCost();
      
      return str;
   }
   
}