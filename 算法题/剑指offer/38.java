//数字在排序数组中出现的次数

public class Main {

    public static int numAppearance(int num, int[] a){
        if(a==null||a.length==0) return 0;
        int n=a.length;
        int one= findOne(num,a,0,n-1);
        int distance= findDistance(num,a,one);
        return distance;
    }

    public static int findOne(int num, int[] a, int begin, int end){
        if(begin<=end){
            int mid=(begin+end)/2;
            if(a[mid]<num) return findOne(num,a,mid+1,end);
            else if(a[mid]>num) return findOne(num,a,begin,mid-1);
            else return mid;
        }
        else
            return -1;
    }

    public static int findDistance(int num, int[] a, int one){
        if(one <0) return 0;
        else if(a==null||a.length<0|| one >=a.length) return 0;
        int n=a.length;
        int last = one;
        int e=a[last];
        while(last+1 <a.length&&a[last+1]==e) last++;
        int first=one;
        e=a[first];
        while(first-1>=0&&a[first-1]==e) first--;
        return last - first +1;
    }

    public static void main(String[] args) {
        System.out.println(numAppearance(3, new int[]{1, 2, 3, 4, 5}));
        System.out.println(numAppearance(4, new int[]{1, 2, 4, 4, 4, 5, 7}));
    }

}



