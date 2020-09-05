//把字符串转换成整数
public class Main {

    public static int parse(String s){
        if(s==null||s.length()==0) return 0;
        int flag=1;
        int num=0;
        if(s.charAt(0)=='-') flag=-1;
        else if(s.charAt(0)=='+') flag=1;
        else{
            int temp=s.charAt(0)-'0';
            if(temp>=0&&temp<=9) num=temp;
            else return 0;
        }
        for (int i = 1; i < s.length(); i++) {
            num=num*10;
            int temp=s.charAt(i)-'0';
            if(temp>=0&&temp<=9) num+=temp;
            else {
                num=num/10;
                break;
            }
        }
        return flag*num;
    }

    public static void main(String[] args) {
        System.out.println(parse("1234"));
        System.out.println(parse("-5678"));
    }

}



