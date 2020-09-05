//表示数值的字符串
public class Main {

    public static boolean isNumber(String s){
        if(s==null||s.length()==0) return false;
        int flag=0;
        int e=0;
        int point=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='-'||s.charAt(i)=='+'){
                flag++;
                if(i>0&&s.charAt(i-1)!='e'&&s.charAt(i-1)!='E') return false;
                if(flag>2) return false;
            }
            else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
                e++;
                if(i==s.length()-1) return false;
                if(e>1) return false;
            }
            else if(s.charAt(i)=='.'){
                point++;
                if(point>1) return false;
                if(e>0) return false;
            }
            else{
                if(!(s.charAt(i)-'0'>=0&&s.charAt(i)-'0'<=9)) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumber("-1e-16"));
        System.out.println(isNumber("1e3.14"));
    }

}



