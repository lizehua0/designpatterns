package main.decoratorpattern;

/**
 * @program: designpatterns
 * @description 装饰者模式
 * @author: zehuali
 * @create: 2019-12-05 11:57
 **/
public abstract class Bevarage {

    protected String description = "未知饮料";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
