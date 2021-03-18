package module3;

import java.util.*;


public class Retirement2 {
  public static void main(String[] args) {
        //read inputs
        
        Scanner in=new Scanner(System.in);
        
        System.out.print("How much money do you need to retire?");
        double goal=in.nextDouble();
        
        System.out.print("How much money will you contribute every year?");
        double payment=in.nextDouble();
        
        System.out.print("Interest rate in %: ");
          double interestRate=in.nextDouble();
          
          double balance=0;
          int years=0;
          String input;
          
          //update account balnce while goal isn't reache
          
          do
          {
              balance+=payment;
              double interest=payment*interestRate/100;
              balance+=interest;
              years++;
              
              //print current balnce
              System.out.printf("After year %d,your balnce is %,.2f%n",years,balance);
              
              //ask if the user is ready to retire
              System.out.print("Ready to retire? (Y/N)_");
              input=in.next();
          }while(input.equals("N"));
          System.out.println("You can retire in " +years+ "years");
              
    }
    
}
