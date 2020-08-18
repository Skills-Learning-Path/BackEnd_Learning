/*
二叉搜索树的后序遍历序列
*/
public class Main {

    public static boolean verifySequence(int[] sequence){
        if(sequence==null||sequence.length==0){
            return false;
        }
        else if(sequence.length==1){
            return true;
        }
        else{
            return judge(sequence,0,sequence.length-1);
        }
    }

    public static boolean judge(int[] sequence, int begin, int end){
        if(begin>=end){
            return true;
        }
        int i=begin;
        //前半段比sequence[end]小
        while (i<end &&sequence[i]<sequence[end]){
            i++;
        }
        //后半段比sequence[end]大
        for(int j=i;j<end;j++){
            if(sequence[j]<sequence[end]){
                return false;
            }
        }
        return judge(sequence,begin,i-1)&&judge(sequence,i,end-1);
    }

    public static void main(String args[])
    {
        System.out.println(verifySequence(new int[]{5, 7, 6, 9, 11, 10, 8}));
        System.out.println(verifySequence(new int[]{7, 4, 6, 5}));
    }

}

