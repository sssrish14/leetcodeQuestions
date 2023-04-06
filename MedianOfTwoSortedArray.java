class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int merge[]=new int[nums1.length+nums2.length];
        int i,size=0,temp=0,j;
        double med=0.0;
        for(i=0;i<nums1.length;i++)
        {
            merge[size]=nums1[i];
            size++;
        }
        for(i=0;i<nums2.length;i++)
        {
            merge[size]=nums2[i];
            size++;
        }
        for(i=0;i<merge.length;i++)
        {
            for(j=i+1;j<merge.length;j++)
            {
                if(merge[i]>merge[j])
                {
                    temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
        int l= merge.length-1;
        
        int d=l/2;
        int k=d+1;
        
        if(l%2==0)
            med=merge[d];
        else if(l%2!=0)
            {
                int sum=merge[d]+merge[k];
                med=sum/2.0;
            }
        
        return(med);
    }
}
class X
{
    public static void main(String args[])
    {
        Solution ob=new Solution();
        int A[]={1,3};
        int B[]={2,4};
        System.out.println(ob.findMedianSortedArrays(A,B));
    }
}