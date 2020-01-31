package main.singletonpattern;

/**
 * @ClassName HoonSingleton
 * @Description 普通懒汉模式 线程不安全，可以实现懒加载
 * @Author lizehua
 * @Date 2020/1/19 5:29 下午
 * @Version 1.0
 */
public class HoonSingleton {
    private static HoonSingleton instance = null;
    private HoonSingleton(){};
    public static HoonSingleton getInstance(){
        if(null == instance){
            instance = new HoonSingleton();
        }
        return instance;
    }
}
