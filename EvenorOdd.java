import java.util.*;
public class EvenorOdd{

    public static void PrintEvenAndOdd(int[] Arr2){

        System.out.println();
        System.out.println("Checking the Numbers ");
        System.out.println();
        
        Arrays.sort(Arr2);
        
        for(int X : Arr2){
            

            
            if(X % 2 == 0){
                System.out.println(X + "  is Even");
            }else{
                System.out.println(X + " is Odd");
            }
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array : ");
        int n = sc.nextInt();

        int[] Arr1 = new int[n];
        System.out.println("Enter the Elements : ");
        for(int i=0; i < Arr1.length; i ++){
            Arr1[i] = sc.nextInt();
        
        }

        PrintEvenAndOdd(Arr1);



       







        sc.close();
        
    }



}
