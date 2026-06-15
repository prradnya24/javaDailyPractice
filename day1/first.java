package day1;
import java.util.*;

public class first {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        num=sc.nextInt();

        if(num == 0){
            System.out.println("zero");

        
        }
        if(num < 0){
            System.out.println("Given num is negative");
        }
        else{
            System.out.println("Given num is positive");
        }

        
    }
    
}
