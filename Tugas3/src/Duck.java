import Fly.*;
import Sound.*;
import Attack.*;
import Defend.*;
public class Duck {
       private FlyBehaviour flyBehaviour;
       private SoundBehaviour soundBehaviour;
       private AttackBehaviour attackBehaviour;
       private DefendBehaviour defendBehaviour;
       
       public Duck(FlyBehaviour flyBehaviour,
               SoundBehaviour soundBehaviour,AttackBehaviour attackBehaviour,DefendBehaviour defendBehaviour){
           this.flyBehaviour = flyBehaviour;
           this.soundBehaviour = soundBehaviour;
           this.attackBehaviour = attackBehaviour;
           this.defendBehaviour = defendBehaviour;
       }
       
       public void setFlyBehaviour(FlyBehaviour flyBehaviour){
           this.flyBehaviour = flyBehaviour;
       }
       
       public void setSoundBehaviour(SoundBehaviour soundBehaviour){
           this.soundBehaviour = soundBehaviour;
       }
       
       public void setAttackBehaviour(AttackBehaviour attackBehaviour){
           this.attackBehaviour = attackBehaviour;
       }
       
       public void setDefendBehaviour(DefendBehaviour defendBehaviour){
           this.defendBehaviour = defendBehaviour;
       }
       
       public void fly(){
           flyBehaviour.fly();
       }
       
       public void sound(){
           soundBehaviour.sound();
       }
       
        public void attack(){
           attackBehaviour.attack();
       }
      
       public void defend(){
           defendBehaviour.defend();
       }
       
}
