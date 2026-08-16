class Solution {
    public int[] countBits(int n) {
        int [] ar=new int[n+1];
        
        for(int i=0;i<=n;i++)
        {
            int count=0;
            int k=i;
            if(n==0)
            {
                ar[i]=0;
            }
            while(k!=0)
            {
                k=k&(k-1);
                count ++;
            }
            ar[i]=count;
        }
    return ar;
    }
}
