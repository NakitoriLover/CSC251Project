import java.util.*;
import java.io.*;

public class Project_Morgan_Rose
{
   public static void main(String[] args) throws IOException
   {
      
      //file is created
      File file = new File("PolicyInformation.txt");
      
       //verifies existance of file
      if(!file.exists())
      {
         System.out.println("Unable to process file.");
         System.exit(0);
      }
      
      //variables
      int policyNum = 0, age = 0, smokerNum = 0, nonsmokerNum = 0;
      String providerName = "", firstName = "", lastName = "", smokingStatus = "";
      double height = 0.0, weight = 0.0;
      
      //an array list is created to hold the Policy class
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      //file has been opened
      Scanner inputFile = new Scanner(file);
      
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

         //prepares next lines
         if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
           if(inputFile.hasNext())
         {
            inputFile.nextLine();
         }
         
         //expands the array list by creating a new Policy object
         policies.add(new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight));
         
      }
      
      //closes the file
      inputFile.close();
      
      //uses loop to print information about policies
      for(Policy p : policies)
      {
         p.displayInformation();
         System.out.println();
         
         //program checks if the current policy holder is a smoker
         if(p.getSmokingStatus().equalsIgnoreCase("smoker"))
         {
            smokerNum++;
         } else 
         {
            nonsmokerNum++;
         }

      }
      
      //system displays the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + smokerNum);
      System.out.println("The number of policies with a non-smoker is: " + nonsmokerNum);
      
   }
}