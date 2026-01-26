package task7.factory;



import task7.developers.Developer;
import task7.developers.KotlinDeveloper;

public class KotlinCourse extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new KotlinDeveloper();
    }
}
