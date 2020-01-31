package main.decoratorpattern;

/**
 * @program: designpatterns
 * @description 饮料配料摩卡
 * @author: zehuali
 * @create: 2019-12-05 13:52
 **/
public class Mocha extends CondimentDecorator {

    public Mocha(Bevarage bevarage){
        super(bevarage);
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return super.cost() + 20;
    }
}
