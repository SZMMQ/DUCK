package headfirst.designpattern.duck;

import headfirst.designpattern.fly.FlyBehavior;
import headfirst.designpattern.quack.QuackBehavior;

public abstract class Duck {
	      FlyBehavior flyBehavior;
	      QuackBehavior quackBehavior;
	      public abstract void display();
	      public void performFly(){
	          FlyBehavior.fly();
	      }
	      public void performQuack(){
	          QuackBehavior.quack();
	     }
	      public void setFlyBehavior(FlyBehavior fb){
	          this.flyBehavior = fb;
	     } 
	      public void setQuackBehavior(QuackBehavior qb){
	          this.quackBehavior=qb;
	     }
	 }