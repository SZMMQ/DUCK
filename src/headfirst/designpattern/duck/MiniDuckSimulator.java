package headfirst.designpattern.duck;

import headfirst.designpattern.fly.FlyRocketPowered;
import headfirst.designpattern.quack.QuackNoWay;

public class MiniDuckSimulator {
	 
	     public static void main(String[] args) {
	          Duck mallardDuck = new MallardDuck();
	          mallardDuck.display();
	          mallardDuck.performFly();
	          mallardDuck.performQuack();
	          mallardDuck.setQuackBehavior(new QuackNoWay());
	          mallardDuck.performQuack();
	          Duck modelDuck = new ModelDuck();
	          modelDuck.display();
              modelDuck.performFly();
	          modelDuck.performQuack();
	          modelDuck.setFlyBehavior(new FlyRocketPowered());
	          modelDuck.performFly();
	     }
	 
	 }
