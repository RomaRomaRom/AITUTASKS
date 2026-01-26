package task8.factories;



import task8.juniors.JuniorDeveloper;
import task8.middles.MiddleDeveloper;
import task8.seniors.SeniorDeveloper;

public interface DeveloperCourse {

    JuniorDeveloper createJunior();

    MiddleDeveloper createMiddle();

    SeniorDeveloper createSenior();
}
