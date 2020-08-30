//整数中1出现的次数
public class Main {

    public static int numOf1(int num){
        String s= String.valueOf(num);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1') sum++;
        }
        return sum;
    }

    public static int accumNum(int num){
        int sum=0;
        for (int i = 1; i <= num; i++) {
            sum+=numOf1(i);
        }
        return sum;
    }

    public static void main(String args[])
    {
        System.out.println(accumNum(123411));
    }

}



