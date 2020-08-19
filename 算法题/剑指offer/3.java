/*
二维递增数组查找
*/

public class Main {

    public static boolean find(int target, int[][] a){
         if(a.length==0||a[0].length==0) return false;
        int i=0;
        int j=a[0].length-1;
        int ele=a[i][j];
        if(target==ele){
            return true;
        }
        while(target!=ele){
            if(i<a.length&&j>=0){
                ele=a[i][j];
                if(target<ele){
                    j--;
                }
                else if(target>ele){
                    i++;
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
        return false;
    
    }
    


    public static void main(String []args) throws Exception {
        int[][] a=new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(3,a));
    }

}

