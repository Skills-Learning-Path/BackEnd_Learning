//把数组排成最小的数
public class Main {

    public static long arrage(int[] num){
        for (int i = 0; i < num.length; i++) {
            boolean flag=false;
            for (int j = 0; j < num.length-i-1; j++) {
                int temp1=Integer.parseInt(String.valueOf(num[j])+String.valueOf(num[j+1]));
                int temp2=Integer.parseInt(String.valueOf(num[j+1])+String.valueOf(num[j]));
                if(temp1>temp2){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num.length; i++) {
            sb.append(num[i]);
        }
        long res = Long.parseLong(sb.toString());
        return res;
    }

    public static void main(String args[])
    {
        System.out.println(arrage(new int[]{3, 32, 321}));
    }

}



