class Solution {
    public int searchInsert(int[] ar, int t) {
        int l=0;
        int h=ar.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(ar[mid]==t)
            {
                return mid;
            }
            else if(t<ar[mid])
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }
        return l;
    }
    }
