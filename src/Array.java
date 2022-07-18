import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array ");
        int n=s1.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        try {
            System.out.println("Enter the index of the array element you want to access");

            String s = s1.next();

            int index = Integer.parseInt(s);
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Enter Index Within limt Of Array size");
        }
        catch (NumberFormatException nfe){
            System.out.println("Enter valid Number");
        }
    }
}
