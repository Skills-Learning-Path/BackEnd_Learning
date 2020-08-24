//连续子数组的最大和
public class Main {

    public static int biggestSum(int[] a){
        if(a==null||a.length==0){
            return -1;
        }
        int[] dp=new int[a.length];
        dp[0]=a[0];
        int maxnum=dp[0];
        for (int i = 1; i < a.length; i++) {
            //dp[i-1]+a[i]
            //or
            //a[i]
            dp[i]=dp[i-1]<0?a[i]:(dp[i-1]+a[i]);
            if(dp[i]>maxnum) maxnum=dp[i];
        }
        return maxnum;

    }

    public static void main(String args[])
    {
        System.out.println(biggestSum(new int[]{6, -3, -2, 7, -15, 1, 2, 2}));

    }

}

