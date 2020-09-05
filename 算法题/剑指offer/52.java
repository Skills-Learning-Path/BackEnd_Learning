//构建乘积数组
public class Main {

    public static int[] multiply(int[] a){
        if(a==null||a.length==0) return a;
        int[] b=new int[a.length];
        for (int i = 0; i < b.length; i++) {
            int temp=1;
            for (int j = 0; j < i; j++) {
                temp*=a[j];
            }
            for (int j = i+1; j < a.length; j++) {
                temp*=a[j];
            }
            b[i]=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int[] b = multiply(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(b));
    }

}



