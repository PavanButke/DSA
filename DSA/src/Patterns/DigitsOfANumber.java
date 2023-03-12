package Patterns;

public class DigitsOfANumber {
    
    public static void Main(String args[])
    {
        
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
    
    int temp=n;
    int div=1;
    while(temp >=10)
    {
        temp= temp/10;
        div= div*10;
    }
    
    temp=n;
    while(div >=1)
    {
        int quotient= temp / div;
        temp = temp %div;
        
        System.out.println(quotient);
        div= div/10;
    }
  
    }
    

}
