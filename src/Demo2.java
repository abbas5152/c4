import java.time.Month;
import java.util.Scanner;

public class Demo2 {
    public  void showDetails(Mon m){
       if(m==Mon.JAN){
           System.out.println("This is the 1st Month of the Year January");

       }
       else if(m==Mon.FEB){
           System.out.println("This is the 2nd Month of the Year February");

       }
       else if(m==Mon.MAR){
           System.out.println("This is the 3rd Month of the Year March");

       }
        else if(m==Mon.APR){
            System.out.println("This is the 4th Month of the Year April");
        }
        else if(m==Mon.MAY){
           System.out.println("This is the 5th Month of the Year May");

       }
       else if(m==Mon.JUN){
            System.out.println("This is the 6th Month of the Year June");

        }
       else if(m==Mon.JUL){
           System.out.println("This is the 7th Month of the Year July");

       }
       else if(m==Mon.AUG){
           System.out.println("This is the 8th Month of the Year August");

       }
       else if(m==Mon.SEP){
           System.out.println("This is the 9th Month of the Year September");
       }
       else if(m==Mon.OCT){
           System.out.println("This is the 10th Month of the Year October");

       }
       else if(m==Mon.NOV){
           System.out.println("This is the 11th Month of the Year November");

       }
       else if(m==Mon.DEC){
           System.out.println("This is the 12th Month of the Year December");

       }



    }

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the month");
        try {
            String mo = s1.next();

            Demo2 d1 = new Demo2();
            Mon m1 = Mon.valueOf(mo.toUpperCase());
            // System.out.println(m1);
            d1.showDetails(m1);
        }
        catch (IllegalArgumentException i){
            System.out.println("Enter Valid Month name");
        }
    }
}
