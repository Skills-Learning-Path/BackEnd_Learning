//翻转单词顺序列
//左旋转字符串
public class Main {

    public static String ROL(String s, int bits){
        String temp1 = s.substring(0, bits);
        String temp2 = s.substring(bits, s.length());
        return temp2+temp1;
    }

    public static String reverseWord(String s){
        if(s==null||s.length()==0) return s;
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length/2; i++) {
            String temp=strings[i];
            strings[i]=strings[strings.length-i-1];
            strings[strings.length-i-1]=temp;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            if(i!=strings.length-1)
                sb.append(strings[i]+" ");
            else
                sb.append(strings[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWord("Today is Sunday"));
        System.out.println(ROL("abcXYZdef", 3));
    }

}



