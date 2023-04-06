import java.util.*;
class Solution {
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        int i;
String s="";
for(i=0;i<values.length;i++)
{
while(num>=values[i])
{
num-=values[i];
s+=romanLiterals[i];
}}
return(s);     
}
    }
class X
{
    public static void main(String args[])
    {
        Solution ob=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        System.out.println(ob.intToRoman(n));
    }
}