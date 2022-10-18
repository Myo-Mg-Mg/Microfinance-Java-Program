package Project;

import java.util.Scanner;

public class Loan_Schedule {
   public static void main(String[] args) {
       double interest_rate = 0.05;
       double loan_amount, loan_term, principle, interest, total;
       int count;
       String [] month ={"Jan", "Feb", "Mar","Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
       int index;
       
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter loan amount: ");
       loan_amount = scan.nextDouble();
       
       System.out.println("Enter term: ");
       loan_term = scan.nextDouble();
       
       if(loan_term == 12 || loan_term ==18 || loan_term == 24){
           
           principle = loan_amount/loan_term;
           
           System.out.println("Month\tPrinciple\tInterest\tTotal");
           
           for(count =0 ; count < loan_term; count++) {
               
               index = count %12 ;
               System.out.print(month[index] +"\t");
               //interest = loan_amount * interest_rate; //
               interest = ( loan_amount - principle * (count  )) * interest_rate;
               total = principle + interest;
               System.out.println(principle + "\t" + interest +"\t\t" + total);
           
           }
           
           
       }
       else{
           System.out.println("Out of bound loan term");
       }
       
   } 
}
