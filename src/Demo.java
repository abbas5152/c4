import java.util.Scanner;

public class Demo {
    public static Bank getBank(String b) {


        if (b.equals("axis")) {
            Bank b1 = new AxisBank();
            b1.branchName = b;
            b1.ifscCode = "Axis05676";
            AxisBank a = (AxisBank) b1;
            a.rateOfInterest = 7.5;
//            a.displayDetails();
//            a.getCreditCard();
            return b1;


        } else if (b.equals("icici")) {
            Bank b1 = new ICICIBank();
            b1.branchName = b;
            b1.ifscCode = "ICICI05676";
            ICICIBank a = (ICICIBank) b1;
            a.rateOfInterest = 7.2;
//            a.displayDetails();
            return b1;

        } else {
            Bank b1 = null;
//            System.out.println(b1);
            return b1;
        }

    }


    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter branch name");

        String b = s1.next();
       if(b.equals("axis")){
           Bank b1=getBank(b);
           b1.displayDetails();
           AxisBank a = (AxisBank) b1;
           a.getCreditCard();

        }
       else if(b.equals("icici")){
           Bank b1=getBank(b);
           b1.displayDetails();
//           AxisBank a = (AxisBank) b1;
//           a.getCreditCard();

       }
       else{
           Bank b1=getBank(b);
           System.out.println(b1);
       }


    }


}
