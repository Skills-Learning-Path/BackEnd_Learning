//求1+2+3+…+n
public class Main {

    public static int sumFunc(int n){
        int sum=n;
        boolean temp = (n>0)&&((sum+=sumFunc(n-1))>0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFunc(100));
    }

}



