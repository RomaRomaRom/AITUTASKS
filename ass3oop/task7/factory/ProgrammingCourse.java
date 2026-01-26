package task7.factory;



import task7.developers.Developer;

public abstract class ProgrammingCourse {

    public abstract Developer createDeveloper();

    public void educateStudent() {
        Developer developer = createDeveloper();
        developer.study();
    }
}