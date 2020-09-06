//机器人的运动范围
public class Main {

    public static int movingCount(int m, int n, int k){
        boolean[][] a = new boolean[m][n];//记录是否访问过
        return dfs(a,0,0,m,n,k);//dfs
    }

    public static int dfs(boolean[][] visited, int i, int j, int m, int n, int k){
        //i >= m || j >= n是边界条件的判断，k < sum(i, j)判断当前格子坐标是否
        // 满足条件，visited[i][j]判断这个格子是否被访问过
        if(i<0||i>= m||j<0||j>= n|| visited[i][j]|| k<sum(i,j))
            return 0;
        //标注这个格子被访问过
        visited[i][j]=true;
        //沿着当前格子的右边和下边继续访问
        return 1 + dfs(visited,i + 1, j, m, n, k) + dfs(visited,i, j + 1, m, n, k);
    }

    public static int sum(int i,int j){
        int sum=0;
        while(i!=0){
            sum+=i%10;
            i=i/10;
        }
        while(j!=0){
            sum+=j%10;
            j=j/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(movingCount(2, 3, 1));
    }

}



