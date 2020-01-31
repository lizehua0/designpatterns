package main.singletonpattern;

/**
 * @ClassName Holder
 * @Description 通过内部类的方式实现的单利模式，同时满足线程安全和懒加载
 * @Author lizehua
 * @Date 2020/1/19 6:38 下午
 * @Version 1.0
 */
public class Holder {

    private Holder(){}

    private static class InstanceHolder {
        private static Holder instance = new Holder();
    }

    public static Holder getInstance(){
        return InstanceHolder.instance;
    }
}
