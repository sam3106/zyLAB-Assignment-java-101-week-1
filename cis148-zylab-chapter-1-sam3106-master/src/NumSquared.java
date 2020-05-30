import java.util.Scanner;

public class NumSquared {
   public static void main(String[] args) {
      int userNum;
      int userNumSquared;
      Scanner scnr = new Scanner(System.in);
      userNum = scnr.nextInt();
      
      userNumSquared = userNum * userNum;   // Bug here; fix it when instructed
      
      
      System.out.println(userNumSquared);   // Output formatting issue here; fix it when instructed
   }
}