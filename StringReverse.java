import java.util.Scanner;

public class StringReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String inputString=sc.nextLine();

        System.out.println(reverseString(inputString));
    }

    public static String reverseString(String inputString){
        String reverseValue="";
        for(int i=inputString.length()-1; i>=0;i--){
            reverseValue+=inputString.charAt(i);
            System.out.println(inputString.charAt(i));
        }
        return reverseValue;
    }
}