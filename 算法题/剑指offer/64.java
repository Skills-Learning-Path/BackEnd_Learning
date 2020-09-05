//数据流中的中位数
public class Main {
    public static int getMedian(int[] a){
        Arrays.sort(a);
        if(a.length%2==0) return (a[a.length/2-1]+a[a.length/2])/2;
        else return a[a.length/2];
    }

    public static void main(String[] args) {


    }

}



