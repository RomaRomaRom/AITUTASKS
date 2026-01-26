package task7;


import task7.developers.*;
import task7.factory.JavaRush;
import task7.factory.KotlinCourse;
import task7.factory.DotNetCourse;



public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("web");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            JavaRush course = new JavaRush();
        } else if (direction.equals("android")) {
            KotlinCourse course = new KotlinCourse();
        } else {
            DotNetCourse course = new DotNetCourse();
        }
    } 

    static void startLearningProcess() {
        course.educateStudent();
    }
}
