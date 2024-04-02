import java.text.DecimalFormat;
import java.util.Scanner;

public class loanCalculator {
    public static void main(String[] args) {
        final int MONTH_IN_YEAR=12;
       double loanAmount,
       annualInterestRate;
       double monthlyPayment,
       totalPayment;
       double monthlyInterestRate;
       int loanPeriod;
       int numberOfPayments;
       // input values
       Scanner sc=new Scanner(System.in);
       sc.useDelimiter(System.getProperty("line.separator"));
       
       DecimalFormat df = new DecimalFormat("0.00");

     
       System.out.println("Loan Amount in Rands + Cents");
       loanAmount=sc.nextDouble();
       System.out.println("Annualinterest");
       annualInterestRate=sc.nextDouble();
       System.out.println("Loanperiod ");
       loanPeriod=sc.nextInt();
       //compute monthly and total payment
       monthlyInterestRate=annualInterestRate/MONTH_IN_YEAR/100;
       numberOfPayments=loanPeriod*MONTH_IN_YEAR;
       monthlyPayment=(loanAmount*monthlyInterestRate)/(1-Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
       totalPayment= monthlyPayment*numberOfPayments;
        //display the result
       System.out.println("");
       System.out.println("Loan amount     R"+loanAmount);
       System.out.println("Rate in years "+annualInterestRate+"%");
       System.out.println("Loan period  "+loanPeriod);
        
       System.out.println("\n");
       System.out.println("Monthly Payment is R"+ monthlyPayment);
       System.out.println("Total Payment   is R"+ totalPayment);
       
      
	}

    }

