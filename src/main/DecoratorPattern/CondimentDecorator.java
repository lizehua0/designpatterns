package main.DecoratorPattern;

/**
 * @program: designpatterns
 * @description 装饰父类，当我们需要在具体的类中执行一些特定的操作的时候要把它定义成为抽象类
 * @author: zehuali
 * @create: 2019-12-05 13:39
 **/
public class CondimentDecorator extends Bevarage {

    private Bevarage bevarage;

    public CondimentDecorator(Bevarage bevarage){
        this.bevarage = bevarage;
    }

    @Override
    public String getDescription(){
        return bevarage.getDescription();
    }

    @Override
    public double cost() {
        return bevarage.cost();
    }
}
