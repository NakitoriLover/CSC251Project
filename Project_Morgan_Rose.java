import java.util.*;

public class Project_Morgan_Rose
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //variables
      int policyNum, holderAge = 0;
      String providerName, holderFirstName, holderLastName, smokingStatus = "";
      double holderHeight, holderWeight, BMI, policyPrice = 0.0;
      
      //a new policy instance is created at the beginning of the program
      Policy policyholder = new Policy();
      
      //user is prompted for basic info
      System.out.print("Please enter the Policy Number: ");
      policyNum = keyboard.nextInt();
      
      //program enters variable into policy instance
      policyholder.setPolicyNum(policyNum);
      System.out.println();
      
      //filler line to allow line input to function
      keyboard.nextLine();
      
      //this cycle will be generally repeated until line 76 unless noted
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      policyholder.setProviderName(providerName);
      System.out.println();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      holderFirstName = keyboard.nextLine();
      policyholder.setHolderFirstName(holderFirstName);
      System.out.println();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      holderLastName = keyboard.nextLine();
      policyholder.setHolderLastName(holderLastName);
      System.out.println();
      
      System.out.print("Please enter the Policyholder's Age: ");
      holderAge = keyboard.nextInt();
      policyholder.setHolderAge(holderAge);
      System.out.println();
      
      //filler line to allow line input to function
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      //program will validate user input
      while(! "smoker".equalsIgnoreCase(smokingStatus) && ! "non-smoker".equalsIgnoreCase(smokingStatus))
      {
         System.out.println();
         System.out.println("Invalid input, you MUST enter either smoker or non-smoker: ");
         System.out.println();
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokingStatus = keyboard.nextLine();
      }
      
      policyholder.setSmokingStatus(smokingStatus);
      System.out.println();
      
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      holderHeight = keyboard.nextDouble();
      policyholder.setHolderHeight(holderHeight);
      System.out.println();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      holderWeight = keyboard.nextDouble();
      policyholder.setHolderWeight(holderWeight);
      System.out.println();
            
      //bmi and policy price is calculated near the end
      BMI = policyholder.calculateBMI();
      policyPrice = policyholder.calculateCost();
      
      //all information is displayed to user
      System.out.println("Policy Number: " + policyholder.returnPolicyNum());
      System.out.println("Provider Name: " + policyholder.returnProviderName());
      System.out.println("Policyholder's First Name: " + policyholder.returnHolderFirstName());
      System.out.println("Policyholder's Last Name: " + policyholder.returnHolderLastName());
      System.out.println("Policyholder's Age: " + policyholder.returnHolderAge());
      System.out.println("Policyholder's Smoking Status: " + policyholder.returnSmokingStatus());
      System.out.println("Policyholder's Height: " + policyholder.returnHolderHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policyholder.returnHolderWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", BMI);
      System.out.printf("Policyholder's Price: $%.2f\n", policyPrice);
      
   }
}