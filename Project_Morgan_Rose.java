import java.util.*;
import java.io.*;

public class Project_Morgan_Rose
{
   public static void main(String[] args) throws IOException
   {
      
      //file is searched for
      File file = new File("PolicyInformation.txt");
      
       //verifies existance of file
      if(!file.exists())
      {
         System.out.println("Unable to process file.");
         System.exit(0);
      }
      
      //file has been opened
      Scanner inputFile = new Scanner(file);
      
      //variables
      int policyNum = 0, age = 0, smokerNum = 0;
      String providerName = "", firstName = "", lastName = "", smokingStatus = "";
      double height = 0.0, weight = 0.0, BMI = 0.0, policyPrice = 0.0;
      
      //array list is created
      ArrayList<Policy> policylist = new ArrayList<Policy>();
      
      //process file
      while(inputFile.hasNext())
      {
         //uses file to process variable
         policyNum = inputFile.nextInt();
         
         //filler line
         inputFile.nextLine();
         
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         
         //filler line
         inputFile.nextLine();
         
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //new policyholder and policy file is created to use all inputted variables
         PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         Policy policy = new Policy(policyNum, providerName, holder);
         
         //the objects are added to the arraylist
         policylist.add(policy);
         
         //prepares next lines
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
           if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
      }
      
      //closes the file
      inputFile.close();
      
      //creates a for loop to display and interpret information
      for(int i=0; i < policylist.size(); i++)
      {
         System.out.println(policylist.get(i));
         System.out.println();
         
          //program checks if the current policy holder is a smoker
         if(policylist.get(i).getHolder().getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerNum++;
         }
      }
      
      //displays number of policy objects created
      System.out.println("There were " + policylist.size() + " Policy objects created.");
      
      //system displays the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokerNum);
      System.out.println("The number of policies with a non-smoker is: " + (policylist.size() - smokerNum));
      
   }
}