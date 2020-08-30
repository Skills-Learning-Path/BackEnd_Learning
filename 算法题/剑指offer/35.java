//第一个只出现一次的字符
public class Main {

    public static int firstOneChar(String s){
        if(s==null||s.length()==0) return -1;
        else{
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(map.containsKey(c)){
                    map.remove(c);
                }
                else{
                    map.put(c,i);
                }
            }
            int res = s.length();
            for(char c:map.keySet()){
                int loc=map.get(c);
                if(loc<res) res=loc;
            }
            return res;
        }
    }

    public static void main(String args[])
    {
        System.out.println(firstOneChar("abcbadsege"));
    }

}



