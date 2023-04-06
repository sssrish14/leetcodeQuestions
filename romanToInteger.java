import java.util.*;
class Solution {
    int romanToInt(String s)
    {
        int l=s.length();
        int total=0,v1,v2,i;
        char ch1,ch2;
        for(i=0;i<l;i++)
        {
            ch1=s.charAt(i);
             if(ch1=='I')
           v1= 1;
       else if(ch1=='V')
           v1= 5;
       else if(ch1=='X')
           v1= 10;
       else if(ch1=='L')
           v1=50;
       else if(ch1=='C')
           v1=100;
       else if(ch1=='D')
           v1=500;
       else if(ch1=='M')
           v1=1000;
       else
           v1=-1;
            if((i+1)<l)
            {
                ch2=s.charAt((i+1)); 
            if(ch2=='I')
           v2= 1;
       else if(ch2=='V')
           v2= 5;
       else if(ch2=='X')
           v2= 10;
       else if(ch2=='L')
           v2=50;
       else if(ch2=='C')
           v2=100;
       else if(ch2=='D')
           v2=500;
       else if(ch2=='M')
           v2=1000;
       else
           v2=-1;

                if(v1>=v2)
                {
                    total=total+v1;
                }
                     else
                {
                    total=total-v1;  
                }
            }
            else
            {
                total=total+v1;
            }
        }
        return(total);
    }
}
class X
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Solution ob=new Solution();
        System.out.println("Enter the string");
        String s=sc.next();
       int n= ob.romanToInt(s);
        System.out.println(n);
    }
}