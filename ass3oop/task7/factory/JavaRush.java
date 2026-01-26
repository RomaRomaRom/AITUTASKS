package task7.factory;



import task7.developers.Developer;
import task7.developers.JavaDeveloper;

public class JavaRush extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
    