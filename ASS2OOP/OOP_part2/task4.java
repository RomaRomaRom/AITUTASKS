public class task4 {
 private final String manufacturer = "Lamborghini";
 private final String model;
 private final int year;
 private final String color;

 
 public task4(String model, int year, String color) {
    this.model = model;
    this.year = year;
    this.color = color;
 }
 public task4(String model, int year) { 
    this.model = model;
    this.year = year;
    this.color = "orange";
 }
 public task4(String model) {
    this.model = model;
    this.color = "orange";
    this.year = 4321;
 }
}