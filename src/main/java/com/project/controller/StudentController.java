package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Home Page";

    }

    @RequestMapping("/students")
    @ResponseBody
    public String listStudents() {
        return "List of all Students!";

    }
}
