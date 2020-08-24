//字符串的排列
public class Main {

    public static Set<String> insert(char c, String s){
        Set<String> set = new HashSet<>();
        for (int i = 0; i <= s.length(); i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < i; j++) {
                sb.append(s.charAt(j));
            }
            sb.append(c);
            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));
            }
            set.add(sb.toString());
        }

        return set;
    }

    public static String[] arrage(String s){
        if(s==null||s.length()==0)
            return new String[]{""};
        else{
            String[] sub = arrage(s.substring(1,s.length()));
            char c = s.charAt(0);
            Set<String> set = new HashSet<>();
            for (int i = 0; i < sub.length; i++) {
                set.addAll(insert(c,sub[i]));
            }
            String[] res = new String[set.size()];
            Iterator<String> iterator = set.iterator();
            int i=0;
            while (iterator.hasNext()){
                res[i++]=iterator.next();
            }
            return res;
        }

    }

    public static void main(String args[])
    {
        String[] s = arrage("abc");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+";");
        }
        System.out.println();
    }

}
