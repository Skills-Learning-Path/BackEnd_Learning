//数组中只出现一次的数字

public class Main {

    public static int appearOnce(int[] a){
        if(a==null||a.length==0) throw new NullPointerException();
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele:a){
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else
                map.put(ele,1);
        }
        for(int ele:map.keySet()){
            if(map.get(ele).equals(1)) return ele;
        }
        throw new NullPointerException();
    }

    public static void main(String[] args) {
        System.out.println(appearOnce(new int[]{1, 4, 2, 4, 1}));
    }

}



