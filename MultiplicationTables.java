import java.util.*;

public class MultiplicationTables {
    public static void MultiplicationTables(int n ){
        
        System.out.println("Multiplication off "+n);
         for(int i=1; i <= 10 ; i++){
           System.out.println(n + " * " + i +  " = " + n * i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Number To Give Mutliplicatio table : ");
        int n = s.nextInt();

        MultiplicationTables(n);
        
    }
    
}
