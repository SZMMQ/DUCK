package headfirst.designpattern.duck;

import headfirst.designpattern.fly.FlyNoWay;
import headfirst.designpattern.quack.QuackNoWay;

public class ModelDuck extends Duck {
	      public ModelDuck() {
	          flyBehavior = new FlyNoWay();
	          quackBehavior = new QuackNoWay();
	      }
	      
	      @Override
	      public void display() {
	          System.out.println("我是模型鸭");        
	     }
	 }  
