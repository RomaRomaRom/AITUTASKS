
public class task3 {
    private int floorsCount;
    private String developer;
    public task3() {
        this.floorsCount = 5;
        this.developer = "me";
    }
    public task3(int n, String s) {
        this.floorsCount = n;
        this.developer = s;
    }
    
public static void main(String[] args) {
task3 skyscraper = new task3();
task3 skyscraperUnknown = new task3(50, "Unknown");
 }
}
