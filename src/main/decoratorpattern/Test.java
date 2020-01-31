package main.decoratorpattern;

/**
 * @program: designpatterns
 * @description
 * @author: zehuali
 * @create: 2019-12-05 14:05
 **/
public class Test {

    public static void main(String[] args) {

        Bevarage housblend = new HouseBlend();

        System.out.println(housblend.getDescription() + "    $" + housblend.cost());

        Bevarage houseblend2 = new HouseBlend();

        houseblend2 = new Mocha(houseblend2);
        houseblend2 = new Whip(houseblend2);
        System.out.println(houseblend2.getDescription() + "     $" + houseblend2.cost());
    }
}
