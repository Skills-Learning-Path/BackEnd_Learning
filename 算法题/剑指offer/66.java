//矩阵中的路径
public class Main {

    public static boolean exist(char[][] board, String word){
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //从该位置开始搜索
                if(dfs(board,chars,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] word, int i, int j, int index){
        //边界的判断，如果越界直接返回false。index表示的是查找到字符串word的第几个字符，
        //如果这个字符不等于board[i][j]，说明验证这个坐标路径是走不通的，直接返回false
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word[index])
            return false;
        //如果word的每个字符都查找完了，直接返回true
        if(index==word.length-1)
            return true;
        char temp=board[i][j];
        board[i][j]='\0';////把[i][j]置为特殊符号，表示已经被使用过了
        boolean res;
        //左
        res=dfs(board,word,i,j-1,index+1);
        //右
        res|=dfs(board,word,i,j+1,index+1);
        //上
        res|=dfs(board,word,i-1,j,index+1);
        //下
        res|=dfs(board,word,i+1,j,index+1);
        board[i][j]=temp;//回溯
        return res;
    }

    public static void main(String[] args) {

    }

}



