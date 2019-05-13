import java.util.ArrayList;
import java.util.Scanner;

public class SwapSentance{
public static void main(String args[]){
    
    Scanner sc= new Scanner(System.in);
    String s=sc.nextLine();
    
    String[] s_array=s.split(" ");
    String s1="";
    
    for(int i=0; i<s_array.length; i++){
        s1=s_array[i]+" "+s1;
    }
    
    System.out.println(s1);
}    
}