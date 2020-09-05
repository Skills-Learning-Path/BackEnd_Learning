//和为S的两个数字
//和为S的连续正数序列
public class Main {

    public static int calSum(int[] a, int begin, int end){
        int sum=0;
        for (int i = begin; i <= end; i++) {
            sum+=a[i];
        }
        return sum;
    }

    public static ArrayList<ArrayList<Integer>> findContinueSum(int[] a, int sum){
        if(a==null||a.length==0) return null;
        int begin=0;
        int end=0;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        while (end<a.length&&begin<=end&&begin<=(sum+1)/2&&end<=sum){
            int currentsum=calSum(a,begin,end);
            if(currentsum==sum){
                int i=begin;
                ArrayList<Integer> temp = new ArrayList<>();
                while(i<=end){
                    temp.add(a[i]);
                    i++;
                }
                list.add(temp);
                begin++;
            }
            else if(currentsum>sum){
                begin++;
            }
            else{
                end++;
            }
        }
        return list;
    }

    public static int[] findSum(int[] a,int sum){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i]))
                return new int[]{a[i],map.get(a[i])};
            else
                map.put(sum-a[i],a[i]);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] res = findSum(new int[]{1, 2, 3, 4, 5}, 6);
        System.out.println(Arrays.toString(res));
        ArrayList<ArrayList<Integer>> list = findContinueSum(new int[]{1, 2, 3, 4, 5}, 9);
        for(ArrayList<Integer> ele:list){
            System.out.println(ele);
        }
    }

}



