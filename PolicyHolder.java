public class PolicyHolder
{

   //instance fields
   private int age;
   private String firstName, lastName, smokingStatus;
   private double height, weight;
   
   /*
      No argument constructor
   */
   public PolicyHolder()
   {
      age = 0;
      firstName = "";
      lastName = "";
      smokingStatus = "";
      height = 0.0;
      weight = 0.0;
   }
   
   /*
      Argument accepting constructor
      @param firstName holds the policy holder's first name
      @param lastName holds the policy holder's last name
      @param age holds the policy holder's age
      @param smokingStatus holds the policy holder's smoking status
      @param height holds the policy holder's height
      @param weight holds the policy holder's weight
   */
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.age = age;
      this.firstName = firstName;
      this.lastName = lastName;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   /*
      constuctor that accepts own class as an argument
      @param holder holds the PolicyHolder class 
   */
   public PolicyHolder(PolicyHolder holder)
   {
      this.age = holder.age;
      this.firstName = holder.firstName;
      this.lastName = holder.lastName;
      this.smokingStatus = holder.smokingStatus;
      this.height = holder.height;
      this.weight = holder.weight;
   }
   
   //setter methods
   
   /*
      This method sets the Age of the holder
      @param age Age integer inputted by user
   */
   public void setAge(int age)
   {
      this.age = age;
   }
   
    /*
      This method sets the first name of the policy holder
      @param firstName Policy holder's first name is stored as a String
   */
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   /*
      This method sets the last name of the policy holder
      @param lastName Policy holder's last name is stored as a String
   */
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
  /*
      This method sets the smoking status of the policy holder
      @param smokingStatus Policy holder's smoking status is stored as a String
   */
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   /*
      This method sets the height of the policy holder
      @param height Policy holder's height is stored as a double
   */
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   /*
      This method sets the weight of the policy holder
      @param weight Policy holder's weight is stored as a double
   */
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   
   //getter methods
   
   /*
      This method returns the holder age
      @return age Holder age that was previously set
   */
   public int getAge()
   {
      return age;
   }
   
   /*
      This method returns the Policy Holder's First Name
      @return firstName Policy Holder First Name String that was previous set
   */
   public String getFirstName()
   {
      return firstName;
   }
   
    /**
      This method returns the Policy Holder's Last Name
      @return lastName Policy Holder Last Name String that was previous set
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /*
      This method returns the Policy Holder's Smoking Status
      @return smokingStatus Policy Holder Smoking Status String that was previous set
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
    /*
      This method returns the Policy Holder's Height
      @return height Policy Holder Height double that was previous set
   */
   public double getHeight()
   {
      return height;
   }
   
    /*
      This method returns the Policy Holder's Weight
      @return Policy Holder Weight double that was previous set
   */
   public double getWeight()
   {
      return weight;
   }
   
   //other methods
   
   /*
      method creates a ToString method
      @return str output of the ToString method
   */
   public String ToString()
   {
      String str = "Policyholder's First Name: " + firstName +
                   "\nPolicyholder's Last Name: " + lastName +
                   "\nPolicyholder's Age: " + age +
                   "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
                   "\nPolicyholder's Height: " + height + " inches" +
                   "\nPolicyholder's Weight: " + weight + " pounds";
      
      return str;
   }
   
}