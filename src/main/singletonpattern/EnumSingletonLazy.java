package main.singletonpattern;

/**
 * @ClassName EnumSingletonLazy
 * @Description 通过holder的方式实现枚举类的懒加载，但是这种方式没有必要，还不如直接用holder的方式来实现
 * @Author lizehua
 * @Date 2020/1/31 11:38 上午
 * @Version 1.0
 */
public class EnumSingletonLazy {
    private EnumSingletonLazy(){};

    private enum EnumHolder {
        INSTANCE;
        private EnumSingletonLazy instance;

        EnumHolder(){
            this.instance = new EnumSingletonLazy();
        }

    }
        public EnumSingletonLazy getInstance(){
            return EnumHolder.INSTANCE.instance;
        }
}
