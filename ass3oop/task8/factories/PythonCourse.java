package task8.factories;


import task8.juniors.PythonJunior;
import task8.juniors.JuniorDeveloper;
import task8.middles.PythonMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.PythonSenior;
import task8.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse {

    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
