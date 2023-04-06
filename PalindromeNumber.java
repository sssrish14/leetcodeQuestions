class Solution {
    public boolean isPalindrome(int x) {
        int r,d,t;
        r=0;
        t=x;
        if(x<0)
        return false;
        else
        {
            while(x>0)
            {
                d=x%10;
                r=r*10+d;
                x=x/10;
            }
            if(r==t)
            return true;
            else
            return false;
        }
        
    }
   
}