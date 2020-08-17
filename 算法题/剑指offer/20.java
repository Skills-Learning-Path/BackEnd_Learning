/*
顺时针打印矩阵
*/
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static ArrayList<Integer> printMatrix(int[][] matrix){
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix==null) return res;
        int row = matrix.length;
        int col = matrix[0].length;
        if(row==0&&col==0) return res;
        int left=0;
        int right=col-1;
        int top=0;
        int bottom=row-1;
        while(left<=right&&top<=bottom){
            //上
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            //右
            for (int i = top+1; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            if(top<bottom){
                for (int i = right-1; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            if(left<right){
                for (int i = bottom-1; i > top; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            right--;
            top++;
            bottom--;

        }
        return res;
    }


    public static void main(String args[])
    {
        int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printMatrix(a));
    }

}

