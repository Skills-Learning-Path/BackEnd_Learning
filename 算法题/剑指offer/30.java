//最小的K个数
public class Main {

    public static List<Integer> getLeastK(int a[], int k){
        List<Integer> list = new ArrayList<>();
        if(a==null||k==0||k>a.length)
            return list;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (p, q) -> q - p);
        for (int i = 0; i < a.length; i++) {
            if(queue.size()<k){
                queue.offer(a[i]);
            }
            else{
                if(queue.peek()>a[i]){
                    queue.poll();
                    queue.offer(a[i]);
                }
            }
        }
        list.addAll(queue);
        return list;
    }


    public static void main(String args[])
    {
        System.out.println(getLeastK(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 3));
    }

}
