class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length(),j=0;
        int l=(n%k==0)?n/k:n/k+1;
        String[] res=new String[l];
        for(int i=0;i<n;i+=k)
        {
            String x=s.substring(i,Math.min(i+k,n));
            while(x.length()!=k)
                x+=fill;
            res[j++]=x;
        }
        return res;
    }
}