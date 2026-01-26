package task8.factories;



import task8.juniors.JavaJunior;
import task8.juniors.JuniorDeveloper;
import task8.middles.JavaMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.JavaSenior;
import task8.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {

    @Override
    public JuniorDeveloper createJunior() {
        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
