package main.singletonpattern;

/**
 * @ClassName HoonSynSingleton
 * @Description DCL double check lock双验证锁单利模式，保证了懒加载和线程安全，但是会有指令重拍问题,所以会为instatnce加volatile
 * @Author lizehua
 * @Date 2020/1/19 5:56 下午
 * @Version 1.0
 */
public class HoonSynSingleton {
    private volatile static HoonSynSingleton instance;
    private HoonSynSingleton(){
        instance = new HoonSynSingleton();
    }
    public static HoonSynSingleton getInstance(){
        if(null == instance){
            synchronized(HoonSynSingleton.class){
                if(null == instance){
                    instance = new HoonSynSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(HoonSynSingleton.getInstance().getClass().getName());
    }
}
