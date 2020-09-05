//字符流中第一个不重复的字符
public class Main {

    public static char notRepeatedChar(String s){
        if(s==null||s.length()==0) return '\0';
        Set<Character> set = new HashSet<>();
        Set<Character> del = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(set.contains(c)){
                set.remove(c);
                del.add(c);
            }
            else if(!del.contains(c)){
                set.add(c);
            }
        }
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(set.contains(c)) return c;
        }
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(notRepeatedChar("abcbaa"));
    }

}



