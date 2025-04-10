package io.lab.imHarish03.controller;


import io.lab.imHarish03.bean.RequestInfo;
import io.lab.imHarish03.bean.StudentSession;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final RequestInfo requestInfo;
    private final StudentSession studentSession;

    public StudentController(RequestInfo requestInfo, StudentSession studentSession) {
        this.requestInfo = requestInfo;
        this.studentSession = studentSession;
    }

    /**
     * Enrolls the user in a course.
     *
     * @param course the course name to enroll in
     * @return a string containing the enrolled course and the request ID
     */
    @PostMapping("/enroll")
    public String enrollCourse(@RequestParam String course) {
        studentSession.enrollCourse(course);
        return "Course enrolled: " + course + " | Request ID: " + requestInfo.getRequestId();
    }

    /**
     * Retrieves the set of courses the user is enrolled in.
     *
     * @return a set of strings containing the course names
     */
    @GetMapping("/courses")
    public Set<String> getCourses() {
        return studentSession.getCourses();
    }

    /**
     * Retrieves the current HTTP session ID.
     *
     * @param session the current HTTP session
     * @return a string containing the session ID
     */
    @GetMapping("/session-id")
    public String getSessionId(HttpSession session) {
        return "Session ID: " + session.getId();
    }
}
