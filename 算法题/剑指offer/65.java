//滑动窗口的最大值
public class Main {
    public static int maxTotalWindow(int[] a, int k){
        int res=Integer.MIN_VALUE;
        for (int i = 0; i <= a.length-k; i++) {
            int j=i+k-1;
            int maxnum=Integer.MIN_VALUE;
            for (int l = i; l <= j; l++) {
                if(a[l]>maxnum) maxnum=a[l];
            }
            if(maxnum>res) res=maxnum;
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(maxTotalWindow(new int[]{2, 3, 4, 2, 6, 2, 5, 1}, 3));
    }

}



