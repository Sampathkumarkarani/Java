public class condition 
{
    public static void main(String[] args) 
    {
       /*  int x = 8;
        int y = 7;
        int z = 9;*/
        
        /*if (x>10 && x<=20) 
            System.out.println("Hello");   
        else
            System.out.println("bye");
        */

        /*if (x>y) 
        {
            System.out.println(x);
            System.out.println("thank you");
        }
        else 
            System.out.println(y);
        */  
        
        /*if (x>y && x>z)
            System.out.println(x);
        else if(y>x && y>z)
            System.out.println(y); 
        else
            System.out.println(z); 
        */  
        
        // Ternaray operator(?:)

        int n= 4;
        int result;

        /*if(n%2==0)
            result = 10;
        else
            result = 20;*/

        result = n%2==0? 10 : 20;   //ternary operator (?:)
        System.out.println(result);

            
        
        
        
    }    
}

