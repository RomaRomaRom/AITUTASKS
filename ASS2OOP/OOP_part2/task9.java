public class task9 {
 private String model;
 private String color;
 private int price;

 public task9(String model, String color, int price) {
 this.model = model;
 this.color = color;
 this.price = price;
 }

 public boolean equals(task9 obj) {
 if (this.model == obj.model & this.color == obj.color & this.price == obj.price){
    return true;
 }
    

 return false;
}
 public static void main(String[] args) {
 task9 iphone1 = new task9("X", "Black", 999);
 task9 iphone2 = new task9("X", "Black", 999);
 System.out.println(iphone1.equals(iphone2));
 }
}