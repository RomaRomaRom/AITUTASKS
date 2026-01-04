

public class task9 {
    public interface canmove {
        Double speed();
        
    }
    public interface canfly extends canmove {
        Double speed(canfly canFly);
    }

}
