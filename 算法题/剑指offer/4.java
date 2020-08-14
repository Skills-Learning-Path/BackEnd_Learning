/*
字符串替换空格
*/

public class Main {

    public static String replaceSpace(String str){
        if(str==null||str.equals("")) return str;
        char[] array = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==' ') sb.append("%20");
            else sb.append(array[i]);
        }
        return sb.toString();
    }
    


    public static void main(String []args) throws Exception {
        System.out.println(replaceSpace("We are happy."));
    }

}

