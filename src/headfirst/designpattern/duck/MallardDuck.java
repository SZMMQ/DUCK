package headfirst.designpattern.duck;

import headfirst.designpattern.fly.FlyWithWings;
import headfirst.designpattern.quack.QuackWithGuaGua;

public class MallardDuck extends Duck{
	      public MallardDuck() {
	          flyBehavior = new FlyWithWings();
	          quackBehavior = new QuackWithGuaGua();
	      }
	  
	      @Override
	      public void display() {
	          System.out.println("Œ“ «¬ÃÕ∑—º");
	         
	     }
	 }
	
