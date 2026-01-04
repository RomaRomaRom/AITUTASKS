public class task7 {
    private int salary = 1000;

    public int getsalary(){
        return salary;
    }

    public void setsalary(int h) {
        if (h > salary) {
            this.salary = h;
        }
    }

    public static void main(String[] args) {
        task7 p = new task7();
        p.setsalary(3300);
        System.out.println(p.getsalary());
    }
}
