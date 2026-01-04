public class task13 {
 public void eat(Apple apple) {
 System.out.println("The apple has been eaten!");
 }
 public static void main(String[] args) {
    task13 h = new task13();
    Apple a = new Apple();
    h.eat(a);
 }
 public static class Apple  {
 }
}