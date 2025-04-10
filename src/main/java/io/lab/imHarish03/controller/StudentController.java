package io.lab.imHarish03.controller;


import io.lab.imHarish03.bean.RequestInfo;
import io.lab.imHarish03.bean.StudentSession;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final RequestInfo requestInfo;
    private final StudentSession studentSession;

    public StudentController(RequestInfo requestInfo, StudentSession studentSession) {
        this.requestInfo = requestInfo;
        this.studentSession = studentSession;
    }

    @PostMapping("/enroll")
    public String enrollCourse(@RequestParam String course) {
        studentSession.enrollCourse(course);
        return "Course enrolled: " + course + " | Request ID: " + requestInfo.getRequestId();
    }

    @GetMapping("/courses")
    public List<String> getCourses() {
        return studentSession.getCourses();
    }

    @GetMapping("/session-id")
    public String getSessionId(HttpSession session) {
        return "Session ID: " + session.getId();
    }
}
