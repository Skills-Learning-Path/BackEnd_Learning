/*

手写单例模式

*/


class Singleton01{
    private static Singleton01 instance = new Singleton01();
    private Singleton01(){}
    public static Singleton01 getInstance(){
        return instance;
    }
}

class Singleton02{
    private static Singleton02 instance;
    private Singleton02(){}
    public static Singleton02 getInstance(){
        if(instance==null){
            synchronized (Singleton02.class){
                if (instance==null){
                    instance = new Singleton02();
                }
            }
        }
        return instance;
    }
}

enum Singleton03{
    INSTANCE;
}

class Singleton04{
    static class Singleton{
        private static final Singleton instance = new Singleton();
    }
    private Singleton04(){}
    public static final Singleton getInstance(){
        return Singleton.instance;
    }
}
