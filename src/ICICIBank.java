public class ICICIBank extends Bank {

    double rateOfInterest;

    @Override
    public void displayDetails(){
        System.out.println(branchName);
        System.out.println(ifscCode);
        System.out.println(rateOfInterest);
    }

}
