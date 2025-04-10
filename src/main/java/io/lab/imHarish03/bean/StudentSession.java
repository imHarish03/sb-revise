package io.lab.imHarish03.bean;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class StudentSession {

    private final List<String> enrolledCourses = new ArrayList<>();

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
    }

    public List<String> getCourses() {
        return enrolledCourses;
    }
}
