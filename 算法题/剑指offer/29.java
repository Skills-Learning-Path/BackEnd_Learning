//数组中出现次数超过一半的数字
public class Main {

    public static int findNum(int[] a){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                int value = map.get(a[i]);
                map.put(a[i],value+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>a.length/2) return key;
        }
        return -1;
    }

    public static void main(String args[])
    {
        System.out.println(findNum(new int[]{2, 2, 2, 1, 3}));
        System.out.println(findNum(new int[]{1,2,3,4,4}));
    }

}
