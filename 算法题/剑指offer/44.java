//扑克牌顺子
public class Main {

    public static boolean continuousNum(int[] a){
        Arrays.sort(a);
        int num=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0) num++;
            else{
                if(i>0&&a[i]-a[i-1]>1) num=num-(a[i]-a[i-1]-1);
            }
        }
        return num>=0;

    }

    public static void main(String[] args) {
        System.out.println(continuousNum(new int[]{5, 3, 1, 0, 0}));
        System.out.println(continuousNum(new int[]{1, 4, 2, 6, 0}));
    }

}



