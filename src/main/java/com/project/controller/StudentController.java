package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/")
    public String home() {
        return "Home Page";

    }

    @RequestMapping("/students")
    public String listStudents() {
        return "List of all Students!";

    }
}
