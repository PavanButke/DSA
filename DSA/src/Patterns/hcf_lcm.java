package Patterns;

public class hcf_lcm {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        
        int divisor=num1;
        int dividend=num2;
        int hcf=0;
        while(dividend % divisor !=0)
        {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        hcf= divisor;
        int lcm = (num1 * num2)/hcf;
        
        System.out.println(hcf);
        System.out.println(lcm);
     }
    
}
