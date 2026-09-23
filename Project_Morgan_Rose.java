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
      int policyNum, age = 0;
      String providerName, firstName, lastName, smokingStatus = "";
      double height, weight, BMI, policyPrice = 0.0;
      
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
         
         //new policy file is created to use all inputted variables
         Policy policyholder = new Policy(policyNum, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         //Policy file uses displayInformation method to display information
         policyholder.displayInformation();
         System.out.println();
         
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
      
   }
}