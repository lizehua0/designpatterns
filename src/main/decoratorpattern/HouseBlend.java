package main.decoratorpattern;

/**
 * @program: designpatterns
 * @description
 * @author: zehuali
 * @create: 2019-12-05 13:44
 **/
public class HouseBlend extends Bevarage {

    public HouseBlend(){
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return 5;
    }
}
