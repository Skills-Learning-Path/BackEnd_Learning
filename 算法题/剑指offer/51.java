//数组中重复的数字
public class Main {

    public static int repeatNum(int[] a){
        Arrays.sort(a);
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1]==a[i]) return a[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(repeatNum(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }

}



