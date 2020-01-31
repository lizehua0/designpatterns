package main.singletonpattern;

/**
 * @ClassName EnumSingleton
 * @Description 利用枚举类只实例化一次的特点来实现单利模式，这种方式实现足够优雅，但是这种方法不能实现懒加载。
 * @Author lizehua
 * @Date 2020/1/31 11:31 上午
 * @Version 1.0
 */
public enum EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
