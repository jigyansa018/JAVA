import java.util.Scanner;
public class Multi_Table {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want:");

        int a =s.nextInt();
        System.out.println("Multiplication Table for " + a + ":");
        for (int i =1; i<=10;i++){
            
            System.out.println(a+" * "+i+" = "+a*i);
            
            s.close();
        }
    }   
}
