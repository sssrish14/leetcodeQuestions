import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        String ar[]=new String[numRows];
        String res="";
        int row=0,i,flag=0;
        boolean down;
        for(i=0;i<numRows;i++)
        {
            ar[i]="";
        }
        down=false;
        for(i=0;i<s.length();i++)
        {
            ar[row]+=s.charAt(i);
            if(row==numRows-1 && numRows!=1)
            {
                down=false;
            }
            if(row==0 && numRows!=1)
            {
                down=true;
            }
            if(row==0 && numRows==1)
            {
                flag=1;
                down=false;
            }
            if(down==false && flag!=1)
                row--;
            else if(down==true && flag!=1)
                row++;
            else if(flag==1 && down==false)
                row=0;
                
        }
        for(i=0;i<numRows;i++)
            res=res.concat(ar[i]);
        
        return(res);
        
    }
}
class X
{
    public static void main(String args[])
    {
        Solution ob=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.next();
        System.out.println("Enter numRows");
        int n=sc.nextInt();
        
        System.out.println(ob.convert(s,n));
    }
}