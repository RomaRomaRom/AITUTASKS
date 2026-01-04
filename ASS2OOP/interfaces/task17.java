

public class task17 {
 public static void main(String[] args) throws Exception {
 Fox bigFox = new BigFox();
 System.out.println(bigFox.getName());
 System.out.println(bigFox.getColor());
 }

 public interface Animal {
 int getColor();
 }
 public static class Fox extends AbstractAnimal implements Animal {
 public String getName() {
 return "Fox";
 }
 }

 public static abstract class AbstractAnimal {
        public int getColor() {
            return 1;
        }
 }
 
 public static class BigFox extends Fox{

 }


}