public class task14 {
 public static String showWeather(task14city city) {
    return ("In the city of" + city.getName()  + "today, the temperature is" + city.getTemperature() );
 }
 public static void main(String[] args) {
 task14city d = new task14city("dubai", 33);
 System.out.println(showWeather(d));
 }
}

