

public class task2 {
 public static void main(String[] args) {
 }
 public interface CanFly {
 public void fly();
 }
 public interface CanMove {
 public void move();
 }
 public interface CanEat {
 public void eat();
 }
 public abstract class Dog implements CanEat, CanMove{
 }
 public abstract class Duck implements CanEat, CanMove, CanFly {
 }

}
