package io.lab.imHarish03.bean;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@SessionScope
public class StudentSession {

    private final Set<String> enrolledCourses = new HashSet<>();

    public void enrollCourse(String course) {
        enrolledCourses.add(course);
    }

    public Set<String> getCourses() {
        return enrolledCourses;
    }
}
