package task7.factory;


import task7.developers.Developer;
import task7.developers.DotNetDeveloper;

public class DotNetCourse extends ProgrammingCourse {

    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }
}
