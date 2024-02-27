import java.util.Scanner;

/**
 * div
 */
public class div {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("0 is not be in denominator ");
        }
        
    }
    
}