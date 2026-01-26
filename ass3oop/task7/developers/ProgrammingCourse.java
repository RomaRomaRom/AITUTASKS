package task7.developers;

public abstract class ProgrammingCourse {

    public abstract Developer createDeveloper();

    public void educateStudent() {
        Developer developer = createDeveloper();
        developer.study();
    }
}
