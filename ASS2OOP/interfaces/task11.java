public class task11 {
 public static void main(String[] args) {
 }

 public abstract class cat implements Movable, Edible,Eat {

 }
 public abstract class dog implements Movable,Eat{

 }
 public abstract class mouse implements Movable, Edible {

 }


 //can move
 public interface Movable {
 void move();
 }
 //can be eaten
 public interface Edible {
 void beEaten();
 }
 // might eat someone
 public interface Eat {
 void eat();
 }

}
