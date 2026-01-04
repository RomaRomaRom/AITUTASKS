public class task5 {
 private String type;


public task5(String type) {
 this.type = type;

}
public void initialize(String s) {
    this.type = type;
}
 public static void main(String[] args) {
 task5 building = new task5("Restaurant");
 building.initialize("Barbershop");
 }
}
