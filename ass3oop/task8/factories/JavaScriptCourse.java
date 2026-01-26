package task8.factories;



import task8.juniors.JavaScriptJunior;
import task8.juniors.JuniorDeveloper;
import task8.middles.JavaScriptMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.JavaScriptSenior;
import task8.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse {

    @Override
    public JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
