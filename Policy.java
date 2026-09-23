public class Policy
{
   //instance fields
   private int policyNum, age;
   private String providerName, firstName, lastName, smokingStatus;
   private double height, weight;
   
   //no arg constructor
   public Policy()
   {
      policyNum = 0; 
      age = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   //all arg constructor
   public Policy(int num, String name, String first, String last, int a, String smoke, double h, double w)
   {
      policyNum = num; 
      age = a;
      providerName = name;
      firstName = first;
      lastName = last;
      smokingStatus = smoke;
      height = h;
      weight = w;
   }
   
   /**
      This method sets the policy number
      @param num Policy number integer inputted by user
   */
   public void setPolicyNum(int num)
   {
      policyNum = num;
   }
   
   /**
      This method returns the policy number
      @return Policy Number that was previously set
   */
   public int returnPolicyNum()
   {
      return policyNum;
   }
   
   /**
      This method sets the Age of the holder
      @param a Age integer inputted by user
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
      This method returns the holder age
      @return Holder age that was previously set
   */
   public int returnAge()
   {
      return age;
   }
   
   /**
      This method sets the name of the provider
      @param name Provider name is stored as a String
   */
    public void setProviderName(String name)
   {
      providerName = name;
   }
   
   /**
      This method returns the Provider Name
      @return Provider Name String that was previous set
   */
   public String returnProviderName()
   {
      return providerName;
   }
   
    /**
      This method sets the first name of the policy holder
      @param first Policy holder's first name is stored as a String
   */
   public void setFirstName(String first)
   {
      firstName = first;
   }
   
   /**
      This method returns the Policy Holder's First Name
      @return Policy Holder First Name String that was previous set
   */
   public String returnFirstName()
   {
      return firstName;
   }
   
   /**
      This method sets the last name of the policy holder
      @param last Policy holder's last name is stored as a String
   */
   public void setLastName(String last)
   {
      lastName = last;
   }
   
    /**
      This method returns the Policy Holder's Last Name
      @return Policy Holder Last Name String that was previous set
   */
   public String returnLastName()
   {
      return lastName;
   }
   
  /**
      This method sets the smoking status of the policy holder
      @param smoke Policy holder's smoking status is stored as a String
   */
   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }
   
   /**
      This method returns the Policy Holder's Smoking Status
      @return Policy Holder Smoking Status String that was previous set
   */
   public String returnSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
      This method sets the height of the policy holder
      @param h Policy holder's height is stored as a double
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
    /**
      This method returns the Policy Holder's Height
      @return Policy Holder Height double that was previous set
   */
   public double returnHeight()
   {
      return height;
   }
   
   /**
      This method sets the weight of the policy holder
      @param w Policy holder's weight is stored as a double
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
    /**
      This method returns the Policy Holder's Weight
      @return Policy Holder Weight double that was previous set
   */
   public double returnWeight()
   {
      return weight;
   }
   /**
      This method uses the holder's height and weight to calculate BMI
      @return The result of the BMI calculations utilizing the holder's height and weight
   */
   public double calculateBMI()
   {
      final double CONVFACTOR = 703;
      
      double BMI = (weight * CONVFACTOR) / (height * height);
      return BMI;
   }
   
   /**
      This method uses several methods and variables to calculate the overall cost
      @return The result of the cost calculations utilizing various methods and variables
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
      
      if(age > AGE_THRESHOLD)
      {
         totalCost += ADDITIONAL_FEE_AGE;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
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
      This method uses all previous variables and methods to display information about the cost and policy.
   */
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNum);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (smoker/non-smoker): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", calculateBMI());
      System.out.printf("Policy Price: $%.2f\n", calculateCost());
   }
   
}