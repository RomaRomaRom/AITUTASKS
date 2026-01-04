public class task2 {
 public static final String SKYSCRAPER_WAS_BUILD = "Skyscraper is built.";
 public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Skyscraper is built. The number of floors - ";
 public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Skyscraper is built. Developer - ";

public task2() {
    System.out.println(SKYSCRAPER_WAS_BUILD);
}
public task2(int n) {
    System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + n);
}

public task2(String n) {
    System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + n);
}


 public static void main(String[] args) {
 task2 skyscraper = new task2();
 task2 skyscraperTower = new task2(50);
task2 skyscraperSkyline = new task2("JavaRushDevelopment");
 }
}