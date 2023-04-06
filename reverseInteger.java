import java.util.*;
class Solution {
    public int reverse(int n) {
        int d,s=0;
        if(n<1)
        {
            n*=-1;
            
        while(n>0)
        {
            d=n%10;
            if(s> Integer.MAX_VALUE/10 || s == Integer.MAX_VALUE/10 && d > 7){
        return 0 ;
      }
 
      if(s < Integer.MIN_VALUE/10 || s == Integer.MIN_VALUE/10 && d < -8){
        return 0;}
            s=s*10+d;
            n=n/10;
        }
        s*=-1;
        return(s);
        }
        else
        {
            while(n>0)
        {
            d=n%10;
            if(s> Integer.MAX_VALUE/10 || s == Integer.MAX_VALUE/10 && d > 7){
        return 0 ;
      }
 
      if(s < Integer.MIN_VALUE/10 || s == Integer.MIN_VALUE/10 && d < -8){
        return 0;}
            s=s*10+d;
            n=n/10;
        }
        return(s);
            
        }
        
    }
}
class X{
    public static void main(String args[])
    {
        Solution ob=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(ob.reverse(n));
    }
}