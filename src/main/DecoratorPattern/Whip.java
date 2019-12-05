package main.DecoratorPattern;

/**
 * @program: designpatterns
 * @description
 * @author: zehuali
 * @create: 2019-12-05 14:00
 **/
public class Whip extends CondimentDecorator {

    public Whip(Bevarage bevarage){
        super(bevarage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ",whip";
    }

    @Override
    public double cost() {
        return super.cost() + 30;
    }
}
