import Fly.*;
import Sound.*;
import Attack.*;
import Defend.*;
public class Main {
    public static void main(String[] args) {
       Duck superDuck = new Duck (new RocketFly(), new ToaSound(),new GunAttack(), new ArmorDefend());
       System.out.println("Super Duck Behaviour : ");
       superDuck.fly();
       superDuck.sound();
       superDuck.attack();
       superDuck.defend();
        
       System.out.println("");
       System.out.println("Noob Duck Behaviour : ");
       Duck noobDuck = new Duck (new WingFly(), new NormalSound(), new SwordAttack(), new ShieldDefend() );
       noobDuck.fly();
       noobDuck.sound();
       noobDuck.attack();
       noobDuck.defend();
       
       System.out.println("");
       System.out.println("Super Duck Change Fly Behaviour : ");
       superDuck.setFlyBehaviour(new PlaneFly());
       superDuck.fly();
       superDuck.sound();
       superDuck.attack();
       superDuck.defend();
        
    }
    
}
