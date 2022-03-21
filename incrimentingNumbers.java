import java.util.Scanner;

class Iterations 
{
    
    public static void main(String[] args) 
    {
        //read the inputs of numbers to be multiplied and final number to stop at.
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter multiplier number: ");  
        int A = sc.nextInt();  
        System.out.print("Enter final number: ");
        int X = sc.nextInt();  
        sc.close();
    
        //print the first list of numbers from A to X
        System.out.println("First iterations ");
        System.out.println(" ");
        for (int i = A; i < X+A; i = i + A)
        {
            System.out.print(i + " ");
           
        }
        //use B and Y so that A and X remain the same and can be used to define the third iteration
        int B = (A+1);
        int Y = (X+X);
        
        System.out.println(" ");
        System.out.println("Second iterations");
        System.out.println(" ");
        
        
        for (int i = B; i < Y + B; i = i + B)
        {
            System.out.print(i + " ");
        }
        
        int C = (A+2);
        int Z = (X*3);
        
        System.out.println(" ");
        System.out.println("Third iterations");
        System.out.println(" ");

        for (int i = C ; i < Z + C; i = i + C)
        {
            System.out.print(i + " ");
        }
    }
}