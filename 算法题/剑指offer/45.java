//孩子们的游戏(圆圈中最后剩下的数)
public class Main {

    public static int remainingNum(int n, int m){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int temp=-1;
        while (list.size()>1){
            temp=(temp+m)%list.size();
            list.remove(temp);
            temp--;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        System.out.println(remainingNum(5, 2));
    }

}



