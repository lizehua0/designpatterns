package main.singletonpattern;

/**
 * @ClassName HungerySingleton
 * @Description 饿汉模式 线程安全，但是在类加载的时候就实例化了，耗费内存不能实现懒加载
 * @Author lizehua
 * @Date 2020/1/19 5:16 下午
 * @Version 1.0
 */
public class HungerySingleton {
    private static HungerySingleton intance = new HungerySingleton();
    private HungerySingleton (){};
    public static HungerySingleton getIntance(){
        return intance;
    }
}
